package com.AkademiQ8.example.AkademiQ8.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "applicants")
public class Applicant {

    @Id
    @Column(name = "applicantId")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name ;

    public Applicant(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Applicant() {

    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
