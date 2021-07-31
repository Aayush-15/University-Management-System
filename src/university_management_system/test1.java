/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package university_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Aayush
 */
public class test1 {
    public static void main(String[] args) {
        try{
            System.out.println("Driver Connected Successfully");
            Class.forName("com.mysql.cj.jdbc.Driver");  
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/university_management_system","root","");  
//here sonoo is database name, root is username and password  
                Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from admin");  
        while(rs.next()){
           System.out.println(rs.getString(1)+" "+rs.getString(2));  
            //con.close();  
            }
        }catch(ClassNotFoundException | SQLException e) {
        }
    }
}
