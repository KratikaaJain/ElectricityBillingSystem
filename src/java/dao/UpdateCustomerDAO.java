/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.app.DB.Db;
import com.app.dto.UpdateCustomerDetailsDto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Idea
 */
public class UpdateCustomerDAO {
    public UpdateCustomerDetailsDto getCustomerData(String meterNo)
    
    {
        UpdateCustomerDetailsDto usdto=new UpdateCustomerDetailsDto();
        try{
            
            Statement st=Db.getStatement();
            String query="Select * from addcustomer where meterNo='"+meterNo+"'";
            ResultSet rs= st.executeQuery(query);
           if(rs.next()){
               usdto.setUsername(rs.getString(1));
               usdto.setMeterNo(rs.getString(2));
               usdto.setState(rs.getString(3));
               usdto.setCity(rs.getString(4));
               usdto.setAddress(rs.getString(5));
               usdto.setEmail(rs.getString(6));
               usdto.setContact(rs.getString(7));
                        
        }
        
        
    }
        catch(SQLException e){
            System.out.println(e);
        }
    return usdto;
}
}
