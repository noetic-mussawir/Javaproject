package com.PostgresCRUD.CRUDABC.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_entity")
public class UserEntity {
    public UserEntity() {
    }

    @Id
    private Long id;
    private String msisdn;

    private String email;
    private String password, jsld, status, fname,lname;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJsld() {
        return jsld;
    }

    public void setJsld(String jsld) {
        this.jsld = jsld;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public UserEntity(Long id, String msisdn, String email, String password, String jsld, String status, String fname, String lname) {
        this.id = id;
        this.msisdn = msisdn;
        this.email = email;
        this.password = password;
        this.jsld = jsld;
        this.status = status;
        this.fname = fname;
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", msisdn='" + msisdn + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", jsld='" + jsld + '\'' +
                ", status='" + status + '\'' +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                '}';
    }
}
