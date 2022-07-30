package com.MunicipalCorporation.DAO;

import com.MunicipalCorporation.DatabaseConnetion.DBConnections;
import static com.MunicipalCorporation.DatabaseConnetion.DBConnections.getConnection;
import com.MunicipalCorporation.Model.Municipal_Corporation;
import com.MunicipalCorporation.Model.feedback;
import com.MunicipalCorporation.Model.user;
import java.sql.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class registerdao {

    Connection con;

    public registerdao() throws SQLException {
        this.con = DBConnections.getConnection();
    }

    public String insert(user u) throws SQLException {
//        System.out.print(u.getU_Name());
        System.out.print(u.getMunicipal_corp_name());
        System.out.print(u.getMCId());
        
        Connection conn = getConnection();
        String result = "data insert succefully";
        String sql = "insert into municipal_corp.user(U_Name,Username,Password,Mobile_Number,City,State,Area,Age,Municipal_corp_name,MCId) values(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps;
            ps = conn.prepareStatement(sql);
            ps.setString(1, u.getU_Name());
            ps.setString(2, u.getUsername());
            ps.setString(3, u.getPassword());
            ps.setString(4, u.getMobile_Number());
            ps.setString(5, u.getCity());
            ps.setString(6, u.getState());
            ps.setString(7, u.getArea());
            ps.setInt(8, u.getAge());
            ps.setString(9, u.getMunicipal_corp_name());
            ps.setInt(10, u.getMCId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
            result = "data not inserted";
        }
        return result;
        
    }
    
    public List<Municipal_Corporation> SelectMunicipalCorp(String area) throws SQLException {
        List<Municipal_Corporation> com = new ArrayList<>();
        Connection conn = DBConnections.getConnection();
        String sql1 = "SELECT * FROM municipal_corp.municipal_corporation where Area=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setString(1, area);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                System.err.println("RS data for SelectMunicipalCorp is: " + rs.getString("Mc_name"));
                int MCId = rs.getInt("MCId");
                String Mc_name = rs.getString("Mc_name");
                String Commissioner_name = rs.getString("Commissioner_name");
                String Area = rs.getString("Area");
                String Address = rs.getString("Address");
                String Contact = rs.getString("Contact");
                String Gmail = rs.getString("Gmail");
                com.add(new Municipal_Corporation(MCId, Mc_name, Commissioner_name, Area, Address, Contact, Gmail));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }
        
        return com;
        
    }
}
