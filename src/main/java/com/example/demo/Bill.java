

package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Bill {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)//Hibernate Annotation Uttam k roy m mention  h
    private Integer biiId;
    private String billDate;
    private String customerName;

    private String email;
    private int customerNO;
    private String mob;
    private String model;
    private Integer imei;
    private Integer price ;
    private String attend;

    public Integer getBiiId() {
        return biiId;
    }

    public void setBiiId(Integer biiId) {
        this.biiId = biiId;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate( String billDate) {
        this.billDate = billDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCustomerNO() {
        return customerNO;
    }

    public void setCustomerNO(int customerNO) {
        this.customerNO = customerNO;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getImei() {
        return imei;
    }

    public void setImei(Integer imei) {
        this.imei = imei;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getAttend() {
        return attend;
    }

    public void setAttend(String attend) {
        this.attend = attend;
    }




}


