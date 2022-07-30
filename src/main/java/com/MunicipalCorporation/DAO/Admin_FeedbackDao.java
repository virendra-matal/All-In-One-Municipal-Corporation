
package com.MunicipalCorporation.DAO;

import com.MunicipalCorporation.DatabaseConnetion.DBConnections;
import com.MunicipalCorporation.Model.feedback;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Admin_FeedbackDao {
    
    Connection con;
    public Admin_FeedbackDao() throws SQLException {
        this.con = DBConnections.getConnection();
    }
    
    public List<feedback> selectFeedbackForAdmin( int MCorpId) throws SQLException {
        List<feedback> com = new ArrayList<>();
        Connection conn = DBConnections.getConnection();
        String sql1 = "SELECT * FROM municipal_corp.feedback where MCId=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, MCorpId);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                System.err.println("admin feedback details at feedbackDao :   " + rs.getString("Email"));
                int F_Id = rs.getInt("F_Id");
                String Complainant_name = rs.getString("Complainant_name");
                String Email = rs.getString("Email");
                String Mobile_Number = rs.getString("Mobile_Number");
                String Feedback = rs.getString("Feedback");
                String Feedback_Date = rs.getString("Feedback_Date");
                com.add(new feedback(Complainant_name, Email, Feedback, Mobile_Number, Feedback_Date, F_Id));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }
        
        return com;
        
    }
}
