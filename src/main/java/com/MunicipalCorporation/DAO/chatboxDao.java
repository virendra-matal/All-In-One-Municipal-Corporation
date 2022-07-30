package com.MunicipalCorporation.DAO;

import com.MunicipalCorporation.DatabaseConnetion.DBConnections;
import com.MunicipalCorporation.Model.chatbox;
import com.MunicipalCorporation.Model.complaints;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class chatboxDao {

    Connection con;

    public chatboxDao() throws SQLException {
        this.con = DBConnections.getConnection();
    }

    public chatbox insert(chatbox c) throws SQLException {
        this.con = DBConnections.getConnection();
        System.out.println("Connection details :" + con);
        String sql = "insert into municipal_corp.chatbox(Sender_Id, Receiver_Id, Message, MCId) values(?,?,?,?)";
        try {
            PreparedStatement ps;
            ps = con.prepareStatement(sql);
            ps.setInt(1, c.getSender_Id());
            ps.setInt(2, c.getReceiver_Id());
            ps.setString(3, c.getMessage());
            ps.setInt(4, c.getReceiver_Id());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
//            result = "data not inserted";
        }

        return c;

    }
    public chatbox insertAdmin(chatbox c) throws SQLException {
        this.con = DBConnections.getConnection();
        System.out.println("Receiver_Id details :" + c.getReceiver_Id());
        String sql = "insert into municipal_corp.chatbox(Sender_Id, Receiver_Id, Message, MCId) values(?,?,?,?)";
        try {
            PreparedStatement ps;
            ps = con.prepareStatement(sql);
            ps.setInt(1, c.getSender_Id());
            ps.setInt(2, c.getReceiver_Id());
            ps.setString(3, c.getMessage());
            ps.setInt(4, c.getMCId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
//            result = "data not inserted";
        }

        return c;

    }

    public List<chatbox> selectchats(int userid, int MCorpId) throws SQLException {
        List<chatbox> com = new ArrayList<>();
        Connection conn = DBConnections.getConnection();
        String sql1 = "select * from municipal_corp.chatbox where (Sender_Id=? or Sender_Id=? and MCId=?) and (Receiver_Id=? or Receiver_Id=? and MCId=? ) ;";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, userid);
            pst.setInt(2, MCorpId);
            pst.setInt(3, MCorpId);
            pst.setInt(4, MCorpId);
            pst.setInt(5, userid);
            pst.setInt(6, MCorpId);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                System.err.println("Message Details:::00" + rs.getString("Message"));
                int Chat_Id = rs.getInt("Chat_Id");
                int Sender_Id = rs.getInt("Sender_Id");
                int Receiver_Id = rs.getInt("Receiver_Id");
                String Message = rs.getString("Message");
                String Date = rs.getString("Date");

                com.add(new chatbox(Chat_Id, Sender_Id, Receiver_Id, Message, Date));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }

        return com;

    }

    
    
    public List<chatbox> selectUserName(int MCID) throws SQLException {
        List<chatbox> com = new ArrayList<>();
        Connection conn = DBConnections.getConnection();
        String sql1 = "SELECT user.U_Name,user.UserID, max(chatbox.Date) as Date  FROM user inner join chatbox on user.UserID=chatbox.Sender_Id and user.MCId=chatbox.MCId where chatbox.MCId=? group by chatbox.Sender_Id ;";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, MCID);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                System.err.println("max date details :::00" + rs.getString("Date"));
                String U_Name = rs.getString("U_Name");
                int UserID = rs.getInt("UserID");
                String Date = rs.getString("Date");

                com.add(new chatbox(UserID, Date, U_Name));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }

        return com;

    }
    
    public List<chatbox> selectchatsForAdmin(int Adminid, int userid, int MCorpId) throws SQLException {
        List<chatbox> com = new ArrayList<>();
        Connection conn = DBConnections.getConnection();
        String sql1 = "select * from municipal_corp.chatbox where (Sender_Id=? or Sender_Id=? and MCId=?) and (Receiver_Id=? or Receiver_Id=? and MCId=?)";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, Adminid);
            pst.setInt(2, userid);
            pst.setInt(3, MCorpId);
            pst.setInt(4, Adminid);
            pst.setInt(5, userid);
            pst.setInt(6, MCorpId);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                System.err.println("Message Details:::00" + rs.getString("Message"));
                int Chat_Id = rs.getInt("Chat_Id");
                int Sender_Id = rs.getInt("Sender_Id");
                int Receiver_Id = rs.getInt("Receiver_Id");
                String Message = rs.getString("Message");
                String Date = rs.getString("Date");

                com.add(new chatbox(Chat_Id, Sender_Id, Receiver_Id, Message, Date));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }

        return com;

    }
    
}
