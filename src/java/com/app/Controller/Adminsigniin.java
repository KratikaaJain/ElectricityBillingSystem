/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.app.Controller;

import com.app.dto.AdminSignInDto;
import com.app.model.AdminSignInAuthentication;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Idea
 */
public class Adminsigniin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("FrontPage.jsp");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String _username = request.getParameter("username");
        String _password = request.getParameter("password");
        
        AdminSignInDto ad = new AdminSignInDto();
        ad.setUsername(_username);
        ad.setPassword(_password);
        
        AdminSignInAuthentication a = new AdminSignInAuthentication();
        boolean ans = a.isAdmin(ad);
        
        if(ans){
            response.sendRedirect("AdminFrontPage.jsp");
        }
        else{
//            JFrame jFrame = new JFrame();
//            JOptionPane.showMessageDialog(jframe,"Please enter valid information...","Error",JOptionPane.ERROR_MESSAGE);
response.sendRedirect("FrontPage.jsp");
        }
        
    }
    }


