/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.dto;

/**
 *
 * @author Idea
 */
public class BillStatusDto {
    String meterNo,username,address,month,units,calcbill,payment;

    public String getMeterNo() {
        return meterNo;
    }

    public void setMeterNo(String meterNo) {
        this.meterNo = meterNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getCalcbill() {
        return calcbill;
    }

    public void setCalcbill(String calcbill) {
        this.calcbill = calcbill;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
    
}
