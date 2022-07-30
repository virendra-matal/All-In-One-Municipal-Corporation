
package com.MunicipalCorporation.DAO;

import com.MunicipalCorporation.DatabaseConnetion.DBConnections;
import static com.MunicipalCorporation.DatabaseConnetion.DBConnections.getConnection;
import com.MunicipalCorporation.Model.feedback;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class feedbackdao {
    Connection con;

    public feedbackdao() throws SQLException {
        this.con = DBConnections.getConnection();
    }
    public String insert(feedback f) throws SQLException {
        Connection conn = getConnection();
        String result = "data insert succefully";
        String sql = "insert into municipal_corp.feedback(complainant_name, email, mobile_number, feedback, MCId) values(?,?,?,?,?)";
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setString(1, f.getComplainant_name());
            ps.setString(2, f.getEmail());
            ps.setString(3, f.getMobile_number());
            ps.setString(4, f.getFeedback());
            ps.setInt(5, f.getMCId());

            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
            result = "data not inserted";
        }

        return result;

    }
}
