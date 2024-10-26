/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Aayus
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class Tables {

    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;

        try {
            con = ConnectionProvider.getConnection();
            st = con.createStatement();
            st.executeUpdate("create table userPriv (user_key int AUTO_INCREMENT primary key, userRole varchar(25),name varchar(25), username varchar(25), password varchar(25), status varchar(25));");
            //st.executeUpdate("show tables");
            st.executeUpdate("insert into userpriv (userRole, name, username, password, status) values ('admin','sys admin', 'admin', 'root', 'active') ");
            JOptionPane.showMessageDialog(null, "Table created succesfully");
            st.executeUpdate("CREATE PROCEDURE updateExpiredStatus()"
                    + "BEGIN"
                    + "    -- Update the status to 'Expired' for items whose Expiry_Date is in the past"
                    + "    UPDATE pantryItems"
                    + "    SET status = 'Expired'"
                    + "    WHERE Expiry_Date < CURDATE()"
                    + "    AND status = 'Not Expired';");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                st.close();
                con.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
