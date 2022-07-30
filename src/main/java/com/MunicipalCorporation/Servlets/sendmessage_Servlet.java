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

@WebServlet(name = "sendmessage_Servlet", urlPatterns = {"/sendmessage_Servlet"})
public class sendmessage_Servlet extends HttpServlet {

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
//        String Sender_Id="8";
//        String Receiver_Id="1";

        System.out.println("Session id:" + session.getAttribute("UserID"));
        System.out.println("Message:" + Message);

        int Sender_Id = (int) session.getAttribute("UserID");
        int Receiver_Id = (int) session.getAttribute("Municipal_corp_Id");
        System.out.println("Receiver_Id"+Receiver_Id);
//        int Sender_Id=(int) session.getAttribute("User_Id");
//         int Receiver_Id=(int) session.getAttribute("Admin_Id");
//        System.err.println("Sender_Id"+Sender_Id);
//        System.err.println("Receiver_Id"+Receiver_Id);
        chatbox c = new chatbox(Sender_Id, Receiver_Id, Message);
        chatboxDao chat = new chatboxDao();
        chat.insert(c);
//        System.err.println("Sender_Id" + Sender_Id + "Receiver_Id" + Receiver_Id + "Message" + Message);
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
            Logger.getLogger(sendmessage_Servlet.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(sendmessage_Servlet.class.getName()).log(Level.SEVERE, null, ex);
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
