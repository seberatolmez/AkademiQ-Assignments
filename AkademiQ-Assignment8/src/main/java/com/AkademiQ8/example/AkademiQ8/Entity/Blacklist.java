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

    @ManyToOne
    @JoinColumn(name = "applicantId")
    Applicant applicant;
   // private int applicantId;

    public Blacklist(int id , String reason, Date date, Applicant applicant) {
        this.id = id;
        this.reason = reason ;
        this.date = date;
        this.applicant = applicant;
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

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }
}
