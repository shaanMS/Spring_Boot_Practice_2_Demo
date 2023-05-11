package com.example.demo;

import jakarta.persistence.*;


@Entity
@Table(name = "login")
public class Login {



    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer Id;
    private String uType;
    private String uName;
    private String passw;

    public String getuType() {
        return uType;
    }

    public String getuName() {
        return uName;
    }


    public void setUtype(String uType) {
        this.uType = uType;
    }



    public void setUname(String uName) {
        this.uName = uName;
    }

    public String getPassword() {
        return passw;
    }

    public void setPassword(String password) {
        this.passw = password;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }
}
