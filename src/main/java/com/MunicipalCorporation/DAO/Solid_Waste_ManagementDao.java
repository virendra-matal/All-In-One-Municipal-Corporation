package com.MunicipalCorporation.DAO;

import com.MunicipalCorporation.DatabaseConnetion.DBConnections;
import com.MunicipalCorporation.Model.Solid_Waste_Management;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Solid_Waste_ManagementDao {

    Connection con;

    public Solid_Waste_ManagementDao() throws SQLException {
        this.con = DBConnections.getConnection();
    }

    public List<Solid_Waste_Management> selectListOfSolidWaste( int MCorpId) throws SQLException {
        List<Solid_Waste_Management> hosp = new ArrayList<>();
        Connection conn = DBConnections.getConnection();
        String sql1 = "SELECT * FROM municipal_corp.solid_waste_management where MCId=?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql1);
            pst.setInt(1, MCorpId);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
//                int Hospital_Id = rs.getInt("Hospital_Id");
                String Existing_Compactor = rs.getString("Existing_Compactor");
                String Existing_Dumper = rs.getString("Existing_Dumper");
                String Existing_Tippers = rs.getString("Existing_Tippers");
                String Existing_Tractor = rs.getString("Existing_Tractor");
                String Existing_Machanised_Swipping_Machine = rs.getString("Existing_Machanised_Swipping_Machine");
                String Existing_Tricycle = rs.getString("Existing_Tricycle");
                String Existing_Handcraft = rs.getString("Existing_Handcraft");
                String Existing_Waste_Bin = rs.getString("Existing_Waste_Bin");
                String Available_Compactor = rs.getString("Available_Compactor");
                String Available_Dumper = rs.getString("Available_Dumper");
                String Available_Tippers = rs.getString("Available_Tippers");
                String Available_Tractor = rs.getString("Available_Tractor");
                String Available_Machanised_Swipping_Machine = rs.getString("Available_Machanised_Swipping_Machine");
                String Available_Tricycle = rs.getString("Available_Tricycle");
                String Available_Handcraft = rs.getString("Available_Handcraft");
                String Available_Waste_Bin = rs.getString("Available_Waste_Bin");
                String Additional_Dumper_with_closed_body = rs.getString("Additional_Dumper_with_closed_body");
                String Additional_Tractor_with_closed_body = rs.getString("Additional_Tractor_with_closed_body");
                String Additional_Tricycle = rs.getString("Additional_Tricycle");
                String Additional_Dumper_Expenditure = rs.getString("Additional_Dumper_Expenditure");
                String Additional_Tractor_Expenditure = rs.getString("Additional_Tractor_Expenditure");
                String Additional_Tricycle_Expenditure = rs.getString("Additional_Tricycle_Expenditure");
                String Status = rs.getString("Status");
                String Total_Waste_Generated = rs.getString("Total_Waste_Generated");
                String Waste_Collected = rs.getString("Waste_Collected");
                String Waste_Transported = rs.getString("Waste_Transported");
                String Waste_Processed = rs.getString("Waste_Processed");
                String Waste_Dispossed = rs.getString("Waste_Dispossed");

                hosp.add(new Solid_Waste_Management(Existing_Compactor, Existing_Dumper, Existing_Tippers, Existing_Tractor, Existing_Machanised_Swipping_Machine, Existing_Tricycle, Existing_Handcraft, Existing_Waste_Bin, Available_Compactor, Available_Dumper, Available_Tippers, Available_Tractor, Available_Machanised_Swipping_Machine, Available_Tricycle, Available_Handcraft, Available_Waste_Bin, Additional_Dumper_with_closed_body, Additional_Tractor_with_closed_body, Additional_Tricycle, Additional_Dumper_Expenditure, Additional_Tractor_Expenditure, Additional_Tricycle_Expenditure, Status, Total_Waste_Generated, Waste_Collected, Waste_Transported, Waste_Processed, Waste_Dispossed));
            }
        } catch (SQLException e) {
            System.out.println(" Connection Errors :" + e.getMessage());
        }

        return hosp;

    }
}
