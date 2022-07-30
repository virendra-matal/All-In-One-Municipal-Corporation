

package com.MunicipalCorporation.DAO;

import com.MunicipalCorporation.DatabaseConnetion.DBConnections;
import com.MunicipalCorporation.Model.hospital;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class HospitalDao {
        Connection con;
    public HospitalDao() throws SQLException {
        this.con = DBConnections.getConnection();
    }
    
    public List<hospital> selectListOfHospitals( int MCorpId) throws SQLException {
        List<hospital> hosp = new ArrayList<>();
        Connection conn = DBConnections.getConnection();
        String sql1 = "SELECT * FROM municipal_corp.hospital where MCId=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, MCorpId);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                int Hospital_Id = rs.getInt("Hospital_Id");
                String Name_Address_Hospital = rs.getString("Name_Address_Hospital");
                String Contact_No = rs.getString("Contact_No");
                
                hosp.add(new hospital(Name_Address_Hospital, Contact_No, Hospital_Id));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }
        
        return hosp;
        
    }
}
