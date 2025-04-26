package com.bootcampproject.example.BootCampProject.Entity;

import com.bootcampproject.example.BootCampProject.Core.User;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class Applicant extends User {
    private  String about;

    public Applicant(int id, String firstName, String lastName, Date dateOfBirth, String email, String password, String about) {
        super(id, firstName, lastName, dateOfBirth, email, password);
        this.about = about;
    }

   public Applicant() {
   }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
