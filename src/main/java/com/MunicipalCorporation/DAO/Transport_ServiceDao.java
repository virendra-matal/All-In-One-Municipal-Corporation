
package com.MunicipalCorporation.DAO;

import com.MunicipalCorporation.DatabaseConnetion.DBConnections;
import com.MunicipalCorporation.Model.Solid_Waste_Management;
import com.MunicipalCorporation.Model.Trnsport_Service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Transport_ServiceDao {
    
    
    Connection con;

    public Transport_ServiceDao() throws SQLException {
        this.con = DBConnections.getConnection();
    }

    public List<Trnsport_Service> selectListOfServices(int MCorpId) throws SQLException {
        List<Trnsport_Service> hosp = new ArrayList<>();
        Connection conn = DBConnections.getConnection();
        String sql1 = "SELECT * FROM municipal_corp.transport_service where MCId=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, MCorpId);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                int Transport_Service_Id = rs.getInt("Transport_Service_Id");
                String Route = rs.getString("Route");
                String First_Bus = rs.getString("First_Bus");
                String Last_Bus = rs.getString("Last_Bus");
                int Rounds = rs.getInt("Rounds");
                hosp.add(new Trnsport_Service(Route, First_Bus, Last_Bus, Transport_Service_Id, Rounds));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }

        return hosp;

    }
}
