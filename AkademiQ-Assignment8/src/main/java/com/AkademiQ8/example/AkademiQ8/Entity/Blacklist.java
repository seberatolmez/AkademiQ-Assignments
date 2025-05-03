package com.AkademiQ8.example.AkademiQ8.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Blacklist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String reason;
    private Date date;
    private int applicantId;

    public Blacklist(int id , String reason, Date date, int applicantId) {
        this.id = id;
        this.reason = reason ;
        this.date = date;
        this.applicantId = applicantId;
    }

    public Blacklist() {

    }

}
