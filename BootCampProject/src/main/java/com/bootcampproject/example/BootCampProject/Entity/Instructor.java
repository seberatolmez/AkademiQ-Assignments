package com.bootcampproject.example.BootCampProject.Entity;

import com.bootcampproject.example.BootCampProject.Core.User;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class Instructor extends User {
    private String companyName;

    public Instructor(int id, String firstName, String lastName, Date dateOfBirth, String email, String password,String companyName) {
        super(id, firstName, lastName, dateOfBirth, email, password);
        this.companyName = companyName;
    }

    public Instructor() {

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
