package com.MunicipalCorporation.Servlets;

import com.MunicipalCorporation.DAO.Admin_DashboardDao;
import com.MunicipalCorporation.DAO.DepartmentDao;
import com.MunicipalCorporation.Model.admin;
import com.MunicipalCorporation.Model.department;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Admin_Dashboard_Servlet", urlPatterns = {"/Admin_Dashboard_Servlet"})
public class Admin_Dashboard_Servlet extends HttpServlet {

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

        if ("Admin".equals(Municipal_User)) {
            int Admin = (int) session.getAttribute("Admin_Id");
            Admin_DashboardDao add = new Admin_DashboardDao();
            List<admin> data = add.selectAdmin(Admin);
            request.setAttribute("data", data);

        } else {
            int User_Municipal_corp_Id = (int) session.getAttribute("Municipal_corp_Id");
//            int Admin = (int) session.getAttribute("Admin_Id");
            Admin_DashboardDao add = new Admin_DashboardDao();
            List<admin> data = add.selectAdmin(User_Municipal_corp_Id);
            request.setAttribute("data", data);
        }

        

//       RequestDispatcher rd = request.getRequestDispatcher("Html/Admin_dashboard.jsp");
//       rd.forward(request, response);
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
            Logger.getLogger(Admin_Dashboard_Servlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Admin_Dashboard_Servlet.class.getName()).log(Level.SEVERE, null, ex);
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
