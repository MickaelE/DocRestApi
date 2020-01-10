package com.mickenet.DocRestApi.entity;

import javax.persistence.*;

@Entity
@Table(name = "USER_TABLE")
public class UserTable {
    @Id
    @Column(name = "id")
    private null id;

    @Column(name = "USER_NAME")
    private null userName;

    @Column(name = "USER_PASSWORD")
    private null userPassword;

    @Column(name = "DATE_CREATED")
    private null dateCreated;

    @Column(name = "USER_ROLE")
    private null userRole;


    public null getId() {
        return this.id;
    }

    public void setId(null id) {
        this.id = id;
    }

    public null getUserName() {
        return this.userName;
    }

    public void setUserName(null userName) {
        this.userName = userName;
    }

    public null getUserPassword() {
        return this.userPassword;
    }

    public void setUserPassword(null userPassword) {
        this.userPassword = userPassword;
    }

    public null getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(null dateCreated) {
        this.dateCreated = dateCreated;
    }

    public null getUserRole() {
        return this.userRole;
    }

    public void setUserRole(null userRole) {
        this.userRole = userRole;
    }
}
