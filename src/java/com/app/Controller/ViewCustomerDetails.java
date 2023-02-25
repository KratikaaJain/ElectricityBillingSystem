/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.app.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Idea
 */
public class ViewCustomerDetails extends HttpServlet {
    static Connection con=null;
    static Statement st=null;  
    static ResultSet rs=null;
     @Override
     public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
      {  
         PrintWriter out = res.getWriter();  
         res.setContentType("text/html");  
         out.println("<html><body>"); 
         
         String meterNo = req.getParameter("meterNo");
  
         try 
         {  
             Class.forName("com.mysql.cj.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3307/EBS", "root", "Yashi@0603");

             // Here dsnname- mydsn,user id- system(for oracle 10g),password is pintu.  
             st = con.createStatement();  
             rs = st.executeQuery("select * from addcustomer where meterNo = '"+meterNo+"'");  
             out.println("<table align=center cellpadding=5 cellspacing=5 border=1>");  
             out.println("<tr bgcolor=#d1d0fd><th>Username</th><th>Meter No</th><th>State</th><th>City</th><th>Address</th><th>Email</th><th>Contact</th></tr>");  
             while (rs.next()) 
             {  
                 String username = rs.getString("username");  
                 String metNo = rs.getString("meterNo"); 
                 String state = rs.getString("state");  
                 String city = rs.getString("city");
                 String address = rs.getString("address");  
                 String email = rs.getString("email");
                 String contact = rs.getString("contact");
                 
                 out.println("<tr bgcolor=#f1f1f1><td >" + username + "</td><td>" + metNo + "</td><td>" + state + "</td><td>"+ city + "</td><td>" + address + "</td><td>" + email + "</td><td>"+ contact + "</td></tr>");   
             }  
             out.println("</table>");  
             out.println("</html></body>");  
             con.close();  
            }  
             catch (Exception e) 
            {  
             out.println("error");  
         }  
     }  
 }  

