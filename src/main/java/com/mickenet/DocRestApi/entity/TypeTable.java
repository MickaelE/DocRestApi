package com.mickenet.DocRestApi.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "TYPE_TABLE")
public class TypeTable {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "TYPE_NAME")
    private String typeName;

    @Column(name = "DATE_CREATED")
    private Timestamp dateCreated;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Timestamp getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }
}
