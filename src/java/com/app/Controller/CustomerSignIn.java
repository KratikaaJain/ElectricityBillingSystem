/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.app.Controller;

import com.app.dto.AdminSignInDto;
import com.app.dto.CustomerSignInDto;
import com.app.model.AdminSignInAuthentication;
import com.app.model.CustomerSignInAuthentication;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Idea
 */
public class CustomerSignIn extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("FrontPage.jsp");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String _username = request.getParameter("username");
        String _password = request.getParameter("password");
        
        CustomerSignInDto cd = new CustomerSignInDto();
        cd.setUsername(_username);
        cd.setPassword(_password);
        
        CustomerSignInAuthentication a = new CustomerSignInAuthentication();
        boolean ans = a.isCustomer(cd);
        
        if(ans){
            response.sendRedirect("CustomerFrontPage.jsp");
        }
        else{
             JFrame jFrame = new JFrame();
             JOptionPane.showMessageDialog(jFrame,"Please enter valid information...","Error",JOptionPane.ERROR_MESSAGE);
              response.sendRedirect("FrontPage.jsp");
        }
        
    }
}
