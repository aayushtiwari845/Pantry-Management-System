/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbcon;

/**
 *
 * @author Aayus
 */

import java.sql.*;

public class ConnectionProvider {
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/inventory?useSSL=false", "user", "root");
            return con;
        }
        catch (Exception e){
            System.out.println(e);
            return null;
        }
        
    }
}
