/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.model;



import com.app.DB.Db;
import com.app.dto.signupdto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class signupAuthentication {
    
    public boolean isAddCustomer(signupdto cust){
        String _username=cust.getUsername();
        String _password=cust.getPassword();
        String _repeatpassword=cust.getRepeatpassword();
        String _usertype=cust.getUsertype();
        
        try{
            Statement st =null;
            ResultSet rs=null;
                     st=Db.getStatement();
                     String customer="customer";
                     String  query="insert into custSignUp values('"+_username+"','"+_password+"','"+_repeatpassword+"','"+_usertype+"','"+customer+"')";
                     st.executeUpdate(query);
            return true;

                } catch (SQLException ex) {
                    System.out.println(ex);
                }

                if(_username!=null && _password!=null && !_username.trim().equals("") && _repeatpassword!=null &&_password == _repeatpassword )

                {
                    return true;
                }
                return false;
                    }  
}
