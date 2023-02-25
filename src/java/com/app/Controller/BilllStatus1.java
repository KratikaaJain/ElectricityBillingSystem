package com.app.Controller;

import com.app.dto.BillStatusDto;
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
public class BilllStatus1 extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("CustomerFrontPage.jsp");
    }


    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String meterNo=request.getParameter("meterNo");
        String month=request.getParameter("month");

        BillStatusDto bs = new BillStatusDto();
        bs.setMeterNo(meterNo);
        bs.setMonth(month);
        HttpSession session =request.getSession(true);
        session.setAttribute("meterNo",meterNo);
        session.setAttribute("month",month);

        response.sendRedirect("billStatus2.jsp");
    }

}
