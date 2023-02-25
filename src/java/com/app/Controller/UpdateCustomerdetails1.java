/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.app.Controller;

import com.app.dto.UpdateCustomerDetailsDto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Idea
 */
public class UpdateCustomerdetails1 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("CustomerFrontPage.jsp");
    }


    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String meterNo=request.getParameter("meterNo");
        UpdateCustomerDetailsDto uc = new UpdateCustomerDetailsDto();
        uc.setMeterNo(meterNo);
       
        HttpSession session =request.getSession(true);
        session.setAttribute("meterNo",meterNo);
        response.sendRedirect("updateCustomerDetails.jsp");
    }

}
