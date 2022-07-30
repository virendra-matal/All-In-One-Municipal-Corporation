package com.MunicipalCorporation.Servlets;

import com.MunicipalCorporation.DAO.complaintDao;
import com.MunicipalCorporation.Model.complaints;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Complaint_Servlet", urlPatterns = {"/Complaint_Servlet"})
public class Complaint_Servlet extends HttpServlet {

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

        String Type_Of_Complaint = request.getParameter("complaint_type");
        String Ward = request.getParameter("ward");
        String Complainant_Name = request.getParameter("name");
        String Complaint_Description = request.getParameter("desc");
        String Location = request.getParameter("location");
        String Complaint_date = request.getParameter("calender");
        String Mobile_number = request.getParameter("number");
        String Image = request.getParameter("uploadfile1");
//        String Registered = null;
        HttpSession session = request.getSession();
        int userid = (int) session.getAttribute("UserID");
        int Municipal_corp_Id = (int) session.getAttribute("Municipal_corp_Id");
        System.out.println("user id at complaint store=" + userid);
        System.out.println(" Municipal_corp_Id at complaint store=" + Municipal_corp_Id);

        System.out.println(Type_Of_Complaint + " " + Ward + " " + Complainant_Name + " " + Complaint_Description + " " + Location + " " + Complaint_date + " " + Mobile_number + " " + Image);

//        complaints c = new complaints(Type_Of_Complaint, userid, Ward, Complainant_Name, Complaint_Description, Location, Complaint_date, Mobile_number, Image, "Register");
        complaints c = new complaints(Type_Of_Complaint, Ward, Complainant_Name, Complaint_Description, Location, Complaint_date, Mobile_number, Image, "Register", userid, Municipal_corp_Id);
        complaintDao cd = new complaintDao();
        cd.insert(c);
        RequestDispatcher rd = request.getRequestDispatcher("show_Complaint_Servlet");
        rd.forward(request, response);

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
            Logger.getLogger(Complaint_Servlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Complaint_Servlet.class.getName()).log(Level.SEVERE, null, ex);
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
