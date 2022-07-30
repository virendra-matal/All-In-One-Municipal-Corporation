package com.MunicipalCorporation.Servlets;

import com.MunicipalCorporation.DAO.admin_LoginDao;
import com.MunicipalCorporation.DAO.loginclass;
import com.MunicipalCorporation.Model.admin;
import com.MunicipalCorporation.Model.user;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Admin_Login_Servlet", urlPatterns = {"/Admin_Login_Servlet"})
public class Admin_Login_Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @return
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected String processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        HttpSession session = request.getSession();
        response.setContentType("text/html;charset=UTF-8");
        String user = request.getParameter("Username");
        String pass = request.getParameter("Password");
        String Municipal_Corporation = request.getParameter("Municipal_Corporation");
        System.out.println("Municipal_Corporation :" + Municipal_Corporation);
        String result = null;

        admin_LoginDao login = new admin_LoginDao();
        ResultSet rs = login.AdminloginCheck(user, pass, Municipal_Corporation);
        admin add = new admin();

        boolean check = (rs.next() == true);
        System.out.println("Booleean value  :" + check);
        if (check) {

            add.setAdmin_Name(rs.getString("Admin_Name"));
            add.setAdmin_Username(rs.getString("Admin_Username"));
            add.setAdmin_Password("NA");
            add.setMunicipal_Corporation(rs.getString("Municipal_Corporation"));
            add.setMobile_Number(rs.getString("Mobile_Number"));
            add.setAdmin_Email(rs.getString("Admin_Email"));
            add.setAdmin_fax(rs.getString("Admin_fax"));
            add.setAdmin_Gender(rs.getString("Admin_Gender"));
            add.setAdmin_Age(rs.getInt("Admin_Age"));
//            use.s(rs.getInt("Age"));
//            ;
            session.setAttribute("Admin_Id", rs.getInt("Admin_Id"));
            session.setAttribute("Admin_MCorp_Id", rs.getInt("MCId"));
            session.setAttribute("Admin_MCorp_Name", rs.getString("Mc_name"));
            session.setAttribute("UserType", "Admin");
            int Admin = (int) session.getAttribute("Admin_Id");
            int Admin_MCorp_Id = (int) session.getAttribute("Admin_MCorp_Id");
            System.out.println("Admin session value is:" + Admin);
            System.out.println("Admin session MCorp value is:" + Admin_MCorp_Id);
            System.out.println("Municipal_Corporation set:" + rs.getString("Municipal_Corporation"));
            System.out.println("Value set");

            session.setAttribute("Admin_Username", request.getParameter("Admin_Username"));
            request.setAttribute("errorMessage", "Login successfully");
            response.sendRedirect("Html/Admin_dashboard.jsp");

        } else {
//            System.out.println("Something are wrong");
//            session.invalidate();
//            request.setAttribute("errorMessage", "Invalid user or password");
//            RequestDispatcher rd = request.getRequestDispatcher("Html/login.html");
//            rd.forward(request, response);

            request.setAttribute("errorMessage", "Invalid user or password");
            response.sendRedirect("Html/Admin_login.jsp");
        }
        return " ";

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
            Logger.getLogger(Admin_Login_Servlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Admin_Login_Servlet.class.getName()).log(Level.SEVERE, null, ex);
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
