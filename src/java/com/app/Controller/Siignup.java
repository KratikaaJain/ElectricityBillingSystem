/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.app.Controller;

import com.app.dto.signupdto;
import com.app.model.signupAuthentication;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Idea
 */
@WebServlet(name = "Siignup", urlPatterns = {"/Siignup"})
public class Siignup extends HttpServlet {

 @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.sendRedirect("SignUp.jsp");
    }

   
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String _username= request.getParameter("username");
        String _password=request.getParameter("password");
        String _repeatpassword = request.getParameter("checkpassword");
        String _usertype = request.getParameter("loginas");
        
        PrintWriter Out=response.getWriter();
        
        
        
        signupdto cust=new signupdto();
        cust.setUsername(_username);
        cust.setPassword(_password);
        cust.setRepeatpassword(_repeatpassword);
        cust.setUsertype(_usertype);
        
        
        signupAuthentication add=new signupAuthentication();
        boolean addCustomer= add.isAddCustomer(cust);
       
       if(addCustomer){      
            response.sendRedirect("CustomerSignIn.jsp");
        }
        else{
          response.sendRedirect("SignUp.jsp");
        }
        
        
        
    }

    
    

}
