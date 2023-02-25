/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.model;

import com.app.DB.Db;

import com.app.dto.AddMeterDetailsDto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Idea
 */
public class AddMeterDetailsAuthentication {
    
    
      public boolean isAddMeterDetails(AddMeterDetailsDto met){
        
        String meterNo=met.getMeterNo();
        String location=met.getLocation();
        String type=met.getType();
        String phase=met.getPhase();
        String billType=met.getBillType();
       
        try{
            Statement st =null;
            ResultSet rs=null;
                     st=Db.getStatement();
                     String  query="insert into addmeterdetails values('"+meterNo+"','"+location+"','"+type+"','"+phase+"','"+billType+"')";
                     st.executeUpdate(query);
            return true;

                } catch (SQLException ex) {
                    System.out.println(ex);
                }

                if( meterNo!=null && !meterNo.trim().equals("") && location!=null && type!=null && phase!=null && billType!=null )

                {
                    return true;
                }
                return false;
                    }  
    
    
}
