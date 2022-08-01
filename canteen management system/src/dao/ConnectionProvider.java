/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.*;
/**
 *
 * @author Tanmai
 */
public class ConnectionProvider {
    public static Connection getCon()
    {
        try{
          class.forName("com.mysql.jdbc.Driver");
          connection con=DriverManager.getConnection("");/** add url*/
          return con;
           }
            Catch(Exception e)
            {
                return(null);
            }
    }
    
}
