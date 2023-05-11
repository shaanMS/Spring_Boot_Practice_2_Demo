package com.example.demo;

import jakarta.persistence.*;


@Entity
@Table(name = "mobilecompany")
public class MobileCompany {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer compId;
    private String mobilename;
    public String getMobilename() {
        return mobilename;
    }

    public void setMobilename(String mobilename) {
        this.mobilename = mobilename;
    }

    public Integer getCompId() {.
        return compId;
    }

    public void setCompId(Integer compId) {
        this.compId = compId;
    }




}
