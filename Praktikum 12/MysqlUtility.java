/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * File : MysqlUtility.java
 * Deskripsi : Utility class untuk mengelola koneksi ke database MySQL
 * @author Zaidan
 */
public class MysqlUtility {
    
    private static Connection koneksi;
    
    public static Connection getConnection(){
        if (koneksi == null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                // Sesuaikan host, port, nama db
                String url = "jdbc:mysql://localhost:3306/prakpbo";
                // Sesuaikan username dan password
                String user = "root";
                String password = "root";
                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null){
                    System.out.println("Koneksi berhasil");
                }
            } catch (ClassNotFoundException one) {
                System.out.println("Gagal load driver : "+ one.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal koneksi : "+ sqle.getMessage());
            }
        }
        return koneksi;
    }
}