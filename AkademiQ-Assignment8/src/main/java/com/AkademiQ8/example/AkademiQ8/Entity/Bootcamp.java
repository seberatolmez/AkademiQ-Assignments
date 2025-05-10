package com.AkademiQ8.example.AkademiQ8.Entity;

import com.AkademiQ8.example.AkademiQ8.Core.enums.BootcampState;
import com.AkademiQ8.example.AkademiQ8.Core.entity.BaseEntity;
import jakarta.persistence.*;

import java.util.Date;
@Entity
public class Bootcamp extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @JoinColumn(referencedColumnName = "instructorId")
    @ManyToOne
    Instructor instructor;

    private Date startDate;
    private Date endDate;
    private BootcampState bootcampState;

    public Bootcamp(int id, String name, Instructor instructor, Date startDate, Date endDate, BootcampState bootcampState) {
        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.startDate = startDate;
        this.endDate = endDate;
        this.bootcampState = bootcampState;
    }

    public Bootcamp() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BootcampState getBootcampState() {
        return bootcampState;
    }

    public void setBootcampState(BootcampState bootcampState) {
        this.bootcampState = bootcampState;
    }
}
