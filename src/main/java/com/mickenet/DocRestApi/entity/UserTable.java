package com.mickenet.DocRestApi.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "USER_TABLE")
public class UserTable {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "USER_PASSWORD")
    private String userPassword;

    @Column(name = "DATE_CREATED")
    private Timestamp dateCreated;

    @Column(name = "USER_ROLE")
    private int userRole;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return this.userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Timestamp getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getUserRole() {
        return this.userRole;
    }

    public void setUserRole(int userRole) {
        this.userRole = userRole;
    }
}
