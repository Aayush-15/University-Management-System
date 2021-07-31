/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university_management_system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Aayush
 */
public class database_connection 
{
    Connection conn;
    Statement stat;
    public database_connection(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/university_management_system","root","");    
            stat=conn.createStatement();            
        }catch(ClassNotFoundException | SQLException e){ 
            System.out.println(e);
        }  
    }  
}
