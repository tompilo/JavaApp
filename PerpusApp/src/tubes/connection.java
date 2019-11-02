/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Herdian
 */
public class connection {
    Connection con;
    public connection(){
        String id, pass, driver, url;
        id = "root";
        pass = "";
        driver = "com.mysql.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/perpus_db";
        try {
            Class.forName(driver).newInstance();
            con = DriverManager.getConnection(url,id,pass);
            if (con==null){
                JOptionPane.showMessageDialog(null, "Terjadi Kesalahan, Mohon Hubungi Developer");
            } else {
//                JOptionPane.showMessageDialog(null, "Selamat Datang di Aplikasi Administrasi Perpustakaan");
            }
        } catch (Exception e) {
           System.out.println(""+e.getMessage());
        }
    }
    
    public static void main(String[]args) {
        connection k = new connection();
    }
}
