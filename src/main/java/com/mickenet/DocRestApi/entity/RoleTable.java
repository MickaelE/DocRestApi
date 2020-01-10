package com.mickenet.DocRestApi.entity;

import javax.persistence.*;

@Entity
@Table(name = "ROLE_TABLE")
public class RoleTable {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "ROLE_NAME")
    private String roleName;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
