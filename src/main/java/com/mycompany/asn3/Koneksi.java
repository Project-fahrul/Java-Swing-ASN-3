/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.asn3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author helberindo
 */
public class Koneksi {
    public static Connection con = null;

    /**
     *
     * @return
     */
    public static Connection getConnection() {
        try {
            // meanggil driver mysql jdbc
            Class.forName("com.mysql.cj.jdbc.Driver");
            //melakukan koneksi ke database mysql
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kendaraan", 
                    "root", "root");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        if(con != null)
            System.out.println("Koneksi berhasil");
        return con;
    }
    
    public static void CloseConnection(){
        try {
            //menutup koneksi
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
