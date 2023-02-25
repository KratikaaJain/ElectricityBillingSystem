/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.app.Controller;


import com.app.dto.AddMeterDetailsDto;
import com.app.model.AddCustomerAuthentication;
import com.app.model.AddMeterDetailsAuthentication;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static org.apache.tomcat.jni.Buffer.address;


@WebServlet(name = "AddMeterDetails", urlPatterns = {"/AddMeterDetails"})
public class AddMeterDetails extends HttpServlet {

   @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.sendRedirect("AdminFrontPage.jsp");
    }

   
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String meterNo=request.getParameter("meterNo");
        String location = request.getParameter("location");
        String type = request.getParameter("type");
        String phase=request.getParameter("phase");
        String billType = request.getParameter("billType");
        PrintWriter Out=response.getWriter();
        
        
        
        AddMeterDetailsDto cust=new AddMeterDetailsDto();
        cust.setMeterNo(meterNo);
        cust.setLocation(location);
        cust.setType(type);
        cust.setPhase(phase);
        cust.setBillType(billType);
        
        
        
        AddMeterDetailsAuthentication add=new AddMeterDetailsAuthentication();
        boolean addCustomer= add.isAddMeterDetails(cust);
       
       if(addCustomer){      
            
            response.sendRedirect("AdminFrontPage.jsp");
            
        }
        else{
          JFrame jFrame = new JFrame();
           JOptionPane.showMessageDialog(jFrame,"Meter Details didn't add...","Error",JOptionPane.ERROR_MESSAGE);
          response.sendRedirect("AdminFrontPage.jsp");
        }
        
        
        
    }

}
