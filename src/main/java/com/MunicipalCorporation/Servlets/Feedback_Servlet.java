package com.MunicipalCorporation.Servlets;

import com.MunicipalCorporation.DAO.feedbackdao;
import com.MunicipalCorporation.Model.feedback;
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

@WebServlet(name = "Feedback_Servlet", urlPatterns = {"/Feedback_Servlet"})
public class Feedback_Servlet extends HttpServlet {

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
        System.out.println("Municipal_User" + Municipal_User);
        if ("Admin".equals(Municipal_User)) {
            
            
            int Admin_MCorp_Id = (int) session.getAttribute("Admin_MCorp_Id");
            String Complainant_name = request.getParameter("name");
            String Email = request.getParameter("email");
            String Mobile_number = request.getParameter("phone");
            String feedback = request.getParameter("feedback");

            feedback f = new feedback(Complainant_name, Email, feedback, Mobile_number, Admin_MCorp_Id);
            feedbackdao fd = new feedbackdao();
            String result = fd.insert(f);
            response.sendRedirect("Html/Home.jsp");
            
            
        } else {
            
            
            int User_Municipal_corp_Id = (int) session.getAttribute("Municipal_corp_Id");
            String Complainant_name = request.getParameter("name");
            String Email = request.getParameter("email");
            String Mobile_number = request.getParameter("phone");
            String feedback = request.getParameter("feedback");

            feedback f = new feedback(Complainant_name, Email, feedback, Mobile_number, User_Municipal_corp_Id);
            feedbackdao fd = new feedbackdao();
            String result = fd.insert(f);
            response.sendRedirect("Html/Home.jsp");
            
            
        }

//        HttpSession session = request.getSession();
//        int Municipal_corp_Id=(int) session.getAttribute("Municipal_corp_Id");
//        String Complainant_name = request.getParameter("name");
//        String Email = request.getParameter("email");
//        String Mobile_number = request.getParameter("phone");
//        String feedback = request.getParameter("feedback");
//        
//        feedback f=new feedback(Complainant_name, Email, feedback, Mobile_number,Municipal_corp_Id);
//        feedbackdao fd=new feedbackdao();
//        String result=fd.insert(f);
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
            Logger.getLogger(Feedback_Servlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Feedback_Servlet.class.getName()).log(Level.SEVERE, null, ex);
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
