/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Db {
    

    
    static Connection con=null;
    static Statement st=null;
   
    static{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("driver loaded...");

            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/EBS", "root", "");
            System.out.println("connected...");

            st=con.createStatement();

       }   

        catch(ClassNotFoundException e){
            System.out.println(e);
        }
         catch (SQLException e){
            System.out.println(e);
         }
   }
    
    public static Connection getConnection(){
        return con;
    }
    public static Statement getStatement(){
        return st;
    }
    
    
}


    

