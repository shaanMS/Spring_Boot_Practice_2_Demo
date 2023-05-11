package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "mobiledetails")
public class MobileDetails {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer mobId;



    private String mobileName,model;
    private Integer price;
    private Integer quantity;
    private String charger;
    private String baterry;
    private String headset;
    private String memory;
    private String datacable;

    private String cd;



    public Integer getMobId() {
        return mobId;
    }

    public void setMobId(Integer mobId) {
        this.mobId = mobId;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCharger() {
        return charger;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }

    public String getBaterry() {
        return baterry;
    }

    public void setBaterry(String baterry) {
        this.baterry = baterry;
    }

    public String getHeadset() {
        return headset;
    }

    public void setHeadset(String headset) {
        this.headset = headset;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDatacable() {
        return datacable;
    }

    public void setDatacable(String datacable) {
        this.datacable = datacable;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getMobileName() {
        return mobileName;
    }

    public void setMobileName(String mobileName) {
        this.mobileName = mobileName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
