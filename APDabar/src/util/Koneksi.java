/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class Koneksi {
    private static Connection databasekoneksi;
    public static Connection koneksiDB(){
        if (databasekoneksi == null) {
            try {
               String DB, user, pass;
               DB = "jdbc:mysql://localhost:3306/dabar";
               user = "root";
               pass = "";
               
            databasekoneksi = (Connection) DriverManager.getConnection(DB, user, pass);
           //JOptionPane.showMessageDialog(null, "koneksi berhasil");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
     return databasekoneksi;
    }
    
}
