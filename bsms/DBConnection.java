/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ANK
 */
public class DBConnection {
    static Connection con;
    static void Connect()
    {
    try
    {
       String host="jdbc:derby://localhost:1527/BSMS_DB";
       String usn="ABC";
       String psw="123";
       
    con=DriverManager.getConnection(host, usn, psw);
   // JOptionPane.showMessageDialog(null, "Database Connection is successful!");
    }
    catch(SQLException ex)
            {
            JOptionPane.showMessageDialog(null, ex);
            }
    }

   
  
    
}
