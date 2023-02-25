package com.app.dto;


/**
 *
 * @author Idea
 */
public class AddMeterDetailsDto {
    String meterNo,location,type,phase,billType;

    public String getMeterNo() {
        return meterNo;
    }

    public void setMeterNo(String meterNo) {
        this.meterNo = meterNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }
    
}
