
package com.MunicipalCorporation.Servlets;

import com.MunicipalCorporation.DAO.loginclass;
import com.MunicipalCorporation.Model.user;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
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


@WebServlet(name = "login_servlet", urlPatterns = {"/login_servlet"})
public class login_servlet extends HttpServlet {

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

        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        String result = null;

        loginclass lgn = new loginclass();
        ResultSet rs = lgn.loginCheck(user, pass);
        user use = new user();

        boolean check = (rs.next() == true);
        System.out.println("Booleean value  :" + check);
        if (check) {

            use.setU_Name(rs.getString("U_name"));
            use.setUsername(rs.getString("Username"));
            use.setPassword("NA");
            use.setMobile_Number(rs.getString("Mobile_Number"));
            use.setCity(rs.getString("City"));
            use.setState(rs.getString("State"));
            use.setArea(rs.getString("Area"));
            use.setAge(rs.getInt("Age"));
//            use.s(rs.getInt("Age"));
//            ;
            session.setAttribute("UserID", rs.getInt("UserID"));
            session.setAttribute("Municipal_corp_Id", rs.getInt("MCId"));
            session.setAttribute("Municipal_corp_Name", rs.getString("Municipal_corp_name"));
            session.setAttribute("UserType", "Users");
            int UserID=(int) session.getAttribute("UserID");
            int Municipal_corp_Id=(int) session.getAttribute("Municipal_corp_Id");
            System.out.println("Value set: user id="+UserID);
            System.out.println("Value set: Municipal_corp_Id="+Municipal_corp_Id);
//            System.out.println("Value set: Municipal_corp_Name="+Municipal_corp_Name);

//            session.setAttribute("Username", request.getParameter("Username"));
//            request.setAttribute("errorMessage", "Login successfully");
            response.sendRedirect("Html/Home.jsp");

        } else {
//            System.out.println("Something are wrong");
//            session.invalidate();
//            request.setAttribute("errorMessage", "Invalid user or password");
//            RequestDispatcher rd = request.getRequestDispatcher("Html/login.html");
//            rd.forward(request, response);

            request.setAttribute("errorMessage", "Invalid user or password");
            response.sendRedirect("Html/login.jsp");
        }
        return "";

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
            Logger.getLogger(login_servlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(login_servlet.class.getName()).log(Level.SEVERE, null, ex);
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
