package com.app.Controller;

import com.app.dto.AddCustomerDto;
import com.app.dto.signupdto;
import com.app.model.AddCustomerAuthentication;
import com.app.model.signupAuthentication;
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
@WebServlet(name = "AddCustomer", urlPatterns = {"/AddCustomer"})
public class AddCustomer extends HttpServlet {

 @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.sendRedirect("AdminFrontPage.jsp");
    }

   
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String username= request.getParameter("username");
        String meterNo=request.getParameter("meterNo");
        String state = request.getParameter("state");
        String city = request.getParameter("city");
        String address=request.getParameter("address");
        String email = request.getParameter("email");
        String contact = request.getParameter("contact");       
        PrintWriter Out=response.getWriter();
        
        
        
        AddCustomerDto cust=new AddCustomerDto();
        cust.setUsername(username);
        cust.setMeterNo(meterNo);
        cust.setState(state);
        cust.setCity(city);
        cust.setAddress(address);
        cust.setEmail(email);
        cust.setContact(contact);
        
        
        AddCustomerAuthentication add=new AddCustomerAuthentication();
        boolean addCustomer= add.isAddCustomer(cust);
       
       if(addCustomer){      
            
            response.sendRedirect("AdminFrontPage.jsp");
            
        }
        else{
          JFrame jFrame = new JFrame();
           JOptionPane.showMessageDialog(jFrame,"Customer didn't add...","Error",JOptionPane.ERROR_MESSAGE);
          response.sendRedirect("AdminFrontPage.jsp");
        }
        
        
        
    }

    
    

}
