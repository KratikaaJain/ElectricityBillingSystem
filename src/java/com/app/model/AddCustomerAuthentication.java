/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.model;

import com.app.DB.Db;
import com.app.dto.AddCustomerDto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Idea
 */
public class AddCustomerAuthentication {
    public boolean isAddCustomer(AddCustomerDto cust){
        String username=cust.getUsername();
        String meterNo=cust.getMeterNo();
        String state=cust.getState();
        String city=cust.getCity();
        String address=cust.getAddress();
        String email=cust.getEmail();
        String contact=cust.getContact();
        try{
            Statement st =null;
            ResultSet rs=null;
                     st=Db.getStatement();
                     String  query="insert into addcustomer values('"+username+"','"+meterNo+"','"+state+"','"+city+"','"+address+"','"+email+"','"+contact+"')";
                     st.executeUpdate(query);
            return true;

                } catch (SQLException ex) {
                    System.out.println(ex);
                }

                if(username!=null && meterNo!=null && !username.trim().equals("") && state!=null && city!=null && address!=null && email!=null && contact!=null  )

                {
                    return true;
                }
                return false;
                    }  
}
