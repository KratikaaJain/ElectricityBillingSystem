/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.model;

import com.app.DB.Db;
import com.app.dto.UpdateCustomerDetailsDto;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Idea
 */
public class UpdateCustomerDetailsAuthentication {
    
    public boolean isUpdateCustomerDetails(UpdateCustomerDetailsDto ucdto){
        
    String username=ucdto.getUsername();
    String meterNo=ucdto.getMeterNo();
    String state=ucdto.getState();
    String city=ucdto.getCity();
    String address=ucdto.getAddress();
    String email=ucdto.getEmail();
    String contact=ucdto.getContact();
       
        
        
        try{
            Statement st=null;
   
            st=Db.getStatement();
            String  query="update  addcustomer set username='"+username+"', meterNo='"+meterNo+"',state='"+state+"',city='"+city+"',address='"+address+"',email='"+email+"',contact='"+contact+"' where meterNo= '"+meterNo+"' ";
            st.executeUpdate(query);
            
          
           
            return true;
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
       
        return false;
            }
}
