/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.app.Controller;

import com.app.dto.CalculateBillDto;
import com.app.model.CalculateBillAuthentication;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Idea
 */
@WebServlet(name = "CalculateBill", urlPatterns = {"/CalculateBill"})

public class CalculateBill extends HttpServlet {
@Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.sendRedirect("AdminFrontPage.jsp");
    }

   
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String username= request.getParameter("username");
        String meterNo=request.getParameter("meterNo");
        String address=request.getParameter("address");
        String month = request.getParameter("month");
        String units = request.getParameter("units");       
        PrintWriter Out=response.getWriter();
        
        
        
        CalculateBillDto cal=new CalculateBillDto();
        cal.setUsername(username);
        cal.setMeterNo(meterNo);
        cal.setAddress(address);
        cal.setMonth(month);
        cal.setUnits(units);
        
        
        CalculateBillAuthentication add=new CalculateBillAuthentication();
        boolean calculateBill= add.isCalculateBill(cal);
       
       if(calculateBill){      
           
            response.sendRedirect("AdminFrontPage.jsp");
            
        }
        else{
          JFrame jFrame = new JFrame();
           JOptionPane.showMessageDialog(jFrame,"Enter valid information...","Error",JOptionPane.ERROR_MESSAGE);
          response.sendRedirect("AdminFrontPage.jsp");
        }
        
        
        
    }

}
