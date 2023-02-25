/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.model;

import com.app.DB.Db;
import com.app.dto.BillStatusDto;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Idea
 */
public class BillStatusAuthentication {
    
    public boolean ispaymentDetails(BillStatusDto pdto){
        
    String username=pdto.getUsername();
    String meterNo=pdto.getMeterNo();
    String address=pdto.getAddress();
    String month=pdto.getMonth();
    String units=pdto.getUnits();
    String calcbill=pdto.getCalcbill();
    String payment=pdto.getPayment();
        
        
        try{
            Statement st=null;
   
            st=Db.getStatement();
            String  query="update calculatebill set payment='"+payment+"' where meterNo= '"+meterNo+"' AND month= '"+month+"'";
            st.executeUpdate(query);
            
          
           
            return true;
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
       
        return false;
            }
}

