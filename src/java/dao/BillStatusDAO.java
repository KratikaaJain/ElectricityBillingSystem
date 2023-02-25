package dao;

import com.app.DB.Db;
import com.app.dto.BillStatusDto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Idea
 */
public class BillStatusDAO {
    public BillStatusDto getBillStatus(String meterNo,String month)
    
    {
        BillStatusDto bdto=new BillStatusDto();
        try{
            
            Statement st=Db.getStatement();
            String query="Select * from calculatebill where meterNo='"+meterNo+"' AND month='"+month+"'";
            ResultSet rs= st.executeQuery(query);
           if(rs.next()){
               bdto.setUsername(rs.getString(1));
               bdto.setMeterNo(rs.getString(2));
               bdto.setAddress(rs.getString(3));
               bdto.setMonth(rs.getString(4));
               bdto.setUnits(rs.getString(5));
               bdto.setCalcbill(rs.getString(6));
               bdto.setPayment(rs.getString(7));
                        
        }
        
        
    }
        catch(SQLException e){
            System.out.println(e);
        }
    return bdto;
}
}
