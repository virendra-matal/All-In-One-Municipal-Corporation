
package com.MunicipalCorporation.Servlets;

import com.MunicipalCorporation.DAO.chatboxDao;
import com.MunicipalCorporation.Model.chatbox;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "send_Admin_message_Servlet", urlPatterns = {"/send_Admin_message_Servlet"})
public class send_Admin_message_Servlet extends HttpServlet {

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
        
        
        String Message = request.getParameter("Message");
        HttpSession session = request.getSession(false);

        System.out.println("Session id:" + session.getAttribute("Admin_Id"));
        System.out.println("Message:" + Message);

        int Sender_Id = (int) session.getAttribute("Admin_Id");
        int Receiver_Id = Integer.parseInt(request.getParameter("UserId"));
        int MCId = (int) session.getAttribute("Admin_MCorp_Id");
//        int Receiver_Id = 3;
        System.out.println("Sender_Id:" + Sender_Id);
        System.out.println("Receiver_Id:" + Receiver_Id);
        System.out.println("Admin_MCorp_Id:" + MCId);

        chatbox c = new chatbox(Sender_Id, Receiver_Id, MCId, Message);
        chatboxDao chat = new chatboxDao();
        chat.insertAdmin(c);
        System.err.println("Sender_Id" + Sender_Id + "\nReceiver_Id" + Receiver_Id + "\nMessage" + Message+"\nMCId"+MCId);
    
        
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
            Logger.getLogger(send_Admin_message_Servlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(send_Admin_message_Servlet.class.getName()).log(Level.SEVERE, null, ex);
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
