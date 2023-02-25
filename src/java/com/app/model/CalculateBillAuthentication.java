/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.model;

import com.app.DB.Db;
import com.app.dto.CalculateBillDto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class CalculateBillAuthentication {
    public boolean isCalculateBill(CalculateBillDto cust){
        String username=cust.getUsername();
        String meterNo=cust.getMeterNo();
        String address=cust.getAddress();
        String month=cust.getMonth();
        String units=cust.getUnits();
        try{
            Statement st =null;
            ResultSet rs=null;
                     st=Db.getStatement();
                     int calcBill = Integer.parseInt(units)*8;
                     String payment = "Not Paid";

                     String  query="insert into calculatebill values('"+username+"','"+meterNo+"','"+address+"','"+month+"','"+units+"','"+calcBill+"','"+payment+"')";
                     st.executeUpdate(query);
            return true;

                } catch (SQLException ex) {
                    System.out.println(ex);
                }

                if(username!=null && meterNo!=null && !username.trim().equals("")  && address!=null && month!=null && units!=null  )

                {
                    return true;
                }
                return false;
                    }
}
