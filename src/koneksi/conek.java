/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Melvina
 */
public class conek {
    private static Connection koneksi;
    
    public static Connection GetConnection() throws SQLException{        
        if (koneksi==null) {
            new Driver();
        koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbperkuliahan","root","");
        }
        return koneksi;
    }
    
}
