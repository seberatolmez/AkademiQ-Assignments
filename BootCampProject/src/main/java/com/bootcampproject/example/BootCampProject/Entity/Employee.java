package com.bootcampproject.example.BootCampProject.Entity;

import com.bootcampproject.example.BootCampProject.Core.User;
import jakarta.persistence.Entity;

@Entity
public class Employee extends User {
    private String position;

    public Employee(String id, String name, String password, String position ) {
        super();
       this.position = position;
    }
    public  Employee(){

    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
