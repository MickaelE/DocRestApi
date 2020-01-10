package com.mickenet.DocRestApi.entity;

import javax.persistence.*;
import java.sql.Blob;
import java.sql.Timestamp;

@Entity
@Table(name = "DOCUMENT_TABLE")
public class DocumentTable {
    @Id
    @Column(name = "id")
    private int id;

    @Lob
    @Column(name = "DOCUMENT")
    private Blob document;

    @Column(name = "DATE_CREATED")
    private Timestamp dateCreated;

    @Column(name = "DATE_CHANGED")
    private Timestamp dateChanged;

    @Column(name = "CHANGED_BY_USER")
    private int changedByUser;

    @Column(name = "DOCUMENT_SENDER")
    private int documentSender;

    @Column(name = "DOCUMENT_TITLE")
    private String documentTitle;


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Blob getDocument() {
        return this.document;
    }

    public void setDocument(Blob document) {
        this.document = document;
    }

    public Timestamp getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Timestamp getDateChanged() {
        return this.dateChanged;
    }

    public void setDateChanged(Timestamp dateChanged) {
        this.dateChanged = dateChanged;
    }

    public int getChangedByUser() {
        return this.changedByUser;
    }

    public void setChangedByUser(int changedByUser) {
        this.changedByUser = changedByUser;
    }

    public int getDocumentSender() {
        return this.documentSender;
    }

    public void setDocumentSender(int documentSender) {
        this.documentSender = documentSender;
    }

    public String getDocumentTitle() {
        return this.documentTitle;
    }

    public void setDocumentTitle(String documentTitle) {
        this.documentTitle = documentTitle;
    }
}
