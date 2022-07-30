package com.MunicipalCorporation.Servlets;

import com.MunicipalCorporation.DAO.Solid_Waste_ManagementDao;
import com.MunicipalCorporation.Model.Solid_Waste_Management;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "Solid_Waste_Management_Servlet", urlPatterns = {"/Solid_Waste_Management_Servlet"})
public class Solid_Waste_Management_Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");

        HttpSession session = request.getSession();
        String Municipal_User = (String) session.getAttribute("UserType");

        if ("Admin".equals(Municipal_User)) {
            int Admin_MCorp_Id = (int) session.getAttribute("Admin_MCorp_Id");
            Solid_Waste_ManagementDao cda = new Solid_Waste_ManagementDao();
            List<Solid_Waste_Management> hosp = cda.selectListOfSolidWaste(Admin_MCorp_Id);
            request.setAttribute("solid", hosp);
        } else {
            int User_Municipal_corp_Id = (int) session.getAttribute("Municipal_corp_Id");
            Solid_Waste_ManagementDao cda = new Solid_Waste_ManagementDao();
            List<Solid_Waste_Management> hosp = cda.selectListOfSolidWaste(User_Municipal_corp_Id);
            request.setAttribute("solid", hosp);
        }

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
            Logger.getLogger(Solid_Waste_Management_Servlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Solid_Waste_Management_Servlet.class.getName()).log(Level.SEVERE, null, ex);
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
