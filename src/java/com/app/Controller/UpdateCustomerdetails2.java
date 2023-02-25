/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.app.Controller;

import com.app.dto.UpdateCustomerDetailsDto;
import com.app.model.UpdateCustomerDetailsAuthentication;
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
public class UpdateCustomerdetails2 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("updateStudent.jsp");
    }


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        String meterNo=request.getParameter("meterNo");
        String state=request.getParameter("state");
        String city=request.getParameter("city");
        String address=request.getParameter("address");
        String email=request.getParameter("email");
        String contact=request.getParameter("contact");
       
        
       
        
        
        
        UpdateCustomerDetailsDto ucdto=new UpdateCustomerDetailsDto();
        ucdto.setUsername(username);
        ucdto.setMeterNo(meterNo);
        ucdto.setState(state);
        ucdto.setCity(city);
        ucdto.setAddress(address);
        ucdto.setEmail(email);
        ucdto.setContact(contact);
          
        
          UpdateCustomerDetailsAuthentication usa=new UpdateCustomerDetailsAuthentication();
          boolean updateCustomer= usa.isUpdateCustomerDetails(ucdto);
       
       if(updateCustomer){     
            
            response.sendRedirect("CustomerFrontPage.jsp");
        }
        else{
           
             
           JFrame jFrame = new JFrame();
           JOptionPane.showMessageDialog(jFrame,"Please enter valid information......","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
          response.sendRedirect("CustomerFrontPage.jsp");
        }
        
        
        
    }

}
