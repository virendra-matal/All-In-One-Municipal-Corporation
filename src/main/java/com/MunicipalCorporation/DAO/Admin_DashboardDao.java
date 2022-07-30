
package com.MunicipalCorporation.DAO;

import com.MunicipalCorporation.DatabaseConnetion.DBConnections;
import com.MunicipalCorporation.Model.admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Admin_DashboardDao {
     
    Connection con;
    
    public Admin_DashboardDao() throws SQLException {
        this.con = DBConnections.getConnection();
    }
    
    public List<admin> selectAdmin( int admin ) throws SQLException {
        List<admin> addmin = new ArrayList<>();
        Connection conn = DBConnections.getConnection();
        System.err.println("connection"+ conn);
        String sql1 = "select * from municipal_corp.admin where Admin_Id=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, admin);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
//                System.err.println("Ras Details:::00" + rs.getString("Admin_Username"));
                int Admin_Id = rs.getInt("Admin_Id");
                String Admin_Name = rs.getString("Admin_Name");
                String Admin_Username= rs.getString("Admin_Username");
                String Admin_Password = rs.getString("Admin_Password");
                String Municipal_Corporation = rs.getString("Municipal_Corporation");
                String Mobile_Number = rs.getString("Mobile_Number");
                String Admin_Email = rs.getString("Admin_Email");
                String Admin_fax = rs.getString("Admin_fax");
                String Admin_Gender = rs.getString("Admin_Gender");
                int Admin_Age = rs.getInt("Admin_Age");
//                String complaintby = rs.getString("complaintby");
                addmin.add(new admin(Admin_Name, Admin_Username, Admin_Password, Municipal_Corporation, Mobile_Number, Admin_Email, Admin_fax, Admin_Gender, Admin_Id, Admin_Age));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }
        
        return addmin;
        
    }
}
