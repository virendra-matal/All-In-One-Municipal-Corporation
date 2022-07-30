
package com.MunicipalCorporation.Servlets;

import com.MunicipalCorporation.DAO.Ganapati_VisarjanDao;
import com.MunicipalCorporation.Model.Ganpati_Visarjan;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "Ganapti_Visarjan_Booking_Slot_Servlet", urlPatterns = {"/Ganapti_Visarjan_Booking_Slot_Servlet"})
public class Ganapti_Visarjan_Booking_Slot_Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession session = request.getSession();
        String Municipal_User = (String) session.getAttribute("UserType");
        System.out.println("Municipal_User"+Municipal_User);
        if ("Admin".equals(Municipal_User)) {
            int Admin_MCorp_Id = (int) session.getAttribute("Admin_MCorp_Id");
            String Type_of_Registration=request.getParameter("radio");
        String Name=request.getParameter("name");
        String Mobile_Number=request.getParameter("number");
        String Address=request.getParameter("address");
        String Ward=request.getParameter("ward");
        String Place=request.getParameter("place");
        String Date_and_Time=request.getParameter("time");
        String Signature=request.getParameter("uploadfile1");
        Ganpati_Visarjan ganapati=new Ganpati_Visarjan(Type_of_Registration, Name, Mobile_Number, Address, Ward, Place, Date_and_Time, Signature, Admin_MCorp_Id);
        
        Ganapati_VisarjanDao gv=new Ganapati_VisarjanDao();
        gv.insert(ganapati);
        response.sendRedirect("Html/Home.jsp");
        } else {
            int User_Municipal_corp_Id = (int) session.getAttribute("Municipal_corp_Id");
            String Type_of_Registration=request.getParameter("radio");
        String Name=request.getParameter("name");
        String Mobile_Number=request.getParameter("number");
        String Address=request.getParameter("address");
        String Ward=request.getParameter("ward");
        String Place=request.getParameter("place");
        String Date_and_Time=request.getParameter("time");
        String Signature=request.getParameter("uploadfile1");
        Ganpati_Visarjan ganapati=new Ganpati_Visarjan(Type_of_Registration, Name, Mobile_Number, Address, Ward, Place, Date_and_Time, Signature, User_Municipal_corp_Id);
        
        Ganapati_VisarjanDao gv=new Ganapati_VisarjanDao();
        gv.insert(ganapati);
        response.sendRedirect("Html/Home.jsp");
        }
        
        
        
        
////        HttpSession session = request.getSession();
//        int Municipal_corp_Id = (int) session.getAttribute("Municipal_corp_Id");
//        String Type_of_Registration=request.getParameter("radio");
//        String Name=request.getParameter("name");
//        String Mobile_Number=request.getParameter("number");
//        String Address=request.getParameter("address");
//        String Ward=request.getParameter("ward");
//        String Place=request.getParameter("place");
//        String Date_and_Time=request.getParameter("time");
//        String Signature=request.getParameter("uploadfile1");
//        Ganpati_Visarjan ganapati=new Ganpati_Visarjan(Type_of_Registration, Name, Mobile_Number, Address, Ward, Place, Date_and_Time, Signature, Municipal_corp_Id);
//        
//        Ganapati_VisarjanDao gv=new Ganapati_VisarjanDao();
//        gv.insert(ganapati);
//        response.sendRedirect("Html/Home.jsp");
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Ganapti_Visarjan_Booking_Slot_Servlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Ganapti_Visarjan_Booking_Slot_Servlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
