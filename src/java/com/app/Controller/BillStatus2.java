/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.app.Controller;

import com.app.dto.BillStatusDto;
import com.app.model.BillStatusAuthentication;
import java.io.IOException;
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
public class BillStatus2 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("CustomerFrontPage.jsp");
    }


    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String meterNo=request.getParameter("meterNo");
        String address=request.getParameter("address");
        String month=request.getParameter("month");
        String units=request.getParameter("units");
        String calcbill=request.getParameter("calcbill");
        String payment=request.getParameter("payment");      
        
       
        
        
        
        BillStatusDto bdto=new BillStatusDto();
        bdto.setUsername(username);
        bdto.setMeterNo(meterNo);
        bdto.setAddress(address);
        bdto.setMonth(month);
        bdto.setUnits(units);
        bdto.setCalcbill(calcbill);
        bdto.setPayment(payment);
        
          
        
          BillStatusAuthentication bsa=new BillStatusAuthentication();
          boolean billStatus= bsa.ispaymentDetails(bdto);
       
       if(billStatus){     
           
            response.sendRedirect("CustomerFrontPage.jsp");
        }
        else{
           
             
           JFrame jFrame = new JFrame();
           JOptionPane.showMessageDialog(jFrame,"Some error occured......","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
          response.sendRedirect("CustomerFrontPage.jsp");
        }
        
        
        
    }

}

