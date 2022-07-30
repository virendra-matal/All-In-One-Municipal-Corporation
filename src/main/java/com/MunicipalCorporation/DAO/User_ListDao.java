
package com.MunicipalCorporation.DAO;

import com.MunicipalCorporation.DatabaseConnetion.DBConnections;
import com.MunicipalCorporation.Model.user;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class User_ListDao {
    Connection con;
    public User_ListDao() throws SQLException {
        this.con = DBConnections.getConnection();
    }
    
    public List<user> selectUsersForAdmin(int MCorpId) throws SQLException {
        List<user> com = new ArrayList<>();
        Connection conn = DBConnections.getConnection();
        String sql1 = "SELECT * FROM municipal_corp.user where MCId=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, MCorpId);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                System.out.println("user name deatails at user listDoa:    " + rs.getString("U_Name"));
                int UserID = rs.getInt("UserID");
                String U_Name = rs.getString("U_Name");
                String Username = rs.getString("Username");
                String Password = rs.getString("Password");
                String Mobile_Number = rs.getString("Mobile_Number");
                String City = rs.getString("City");
                String State = rs.getString("State");
                String Area = rs.getString("Area");
                var Age = Integer.parseInt( rs.getString("Age"));
                com.add(new user(U_Name, Username, Password, Mobile_Number, City, State, Area, Age, UserID));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }
        
        return com;
        
    }
    
    public String DeleteUsers(int userid) throws SQLException {
        Connection conn = DBConnections.getConnection();
        String sql1 = "Delete  from municipal_corp.user where UserID=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, userid);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }
        
        return "";
        
    }
}
