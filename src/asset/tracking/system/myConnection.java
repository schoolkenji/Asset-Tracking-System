/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asset.tracking.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Setsuna
 */
public class myConnection {
    public static Connection getConnection(){
        Connection con = null;
        
        try{
            Class.forName("com.msql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/javacontactsapp", "root", "");
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
        return con;
}
}
