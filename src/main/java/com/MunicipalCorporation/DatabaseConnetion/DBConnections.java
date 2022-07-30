/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MunicipalCorporation.DatabaseConnetion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vikram
 */
public class DBConnections {

    private static String dburl = "jdbc:mysql://localhost:3306/municipal_corp";
    private static String dbuname = "root";
    private static String dbpassword = "@krisnelasql2020";
    private static String dbdriver = "com.mysql.jdbc.Driver";
    public void loadDriver( String dbdriver)
    {
        try {
            Class.forName(dbdriver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnections.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Connection getConnection() throws SQLException {
        Connection con = null;
        try {
            con = DriverManager.getConnection(dburl, dbuname, dbpassword);
        } catch (java.sql.SQLException ex) {
            System.out.println(" Connection Errors :" + ex.getMessage());
//            Logger.getLogger(registerDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

}
