/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.model;

import com.app.dto.AdminSignInDto;
import com.app.dto.CustomerSignInDto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class CustomerSignInAuthentication {
    public boolean isCustomer(CustomerSignInDto adm){
       
        String _username = adm.getUsername();
        String _password = adm.getPassword();
        String tablepassword="";
            try{

               Statement st = null;
               ResultSet rs= null;
      
            
            st=com.app.DB.Db.getStatement();
            
            String query = "select _password from custsignup where _username='"+_username+"' AND _type='customer' ";
    
            rs=st.executeQuery(query);
            
            if(rs.next()){
                tablepassword = rs.getString(1);
            }else{
                return false;
            }
    
            }
            catch(SQLException e){
                System.out.println(e);
            }
    
          if(_username!=null && _password!=null && !_username.trim().equals("") && _password.equals(tablepassword)){
                   return true;
          }
        return false;
    }

}
