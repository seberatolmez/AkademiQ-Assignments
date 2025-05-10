package com.AkademiQ8.example.AkademiQ8.Entity;

import com.AkademiQ8.example.AkademiQ8.Core.entity.BaseEntity;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Blacklist extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    private String reason;
    private Date date;
   // private int applicantId;

    public Blacklist(int id , String reason, Date date, int applicantId) {
        this.id = id;
        this.reason = reason ;
        this.date = date;
        //this.applicantId = applicantId;
    }

    public Blacklist() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

   /*public int getApplicantId() {
        return applicantId;
    }

   // public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    } */
}
