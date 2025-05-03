package com.AkademiQ8.example.AkademiQ8.Entity;

import com.AkademiQ8.example.AkademiQ8.Core.BootcampState;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;
@Entity
public class Bootcamp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int instuctorId;
    private Date startDate;
    private Date endDate;
    private BootcampState bootcampState;

    public Bootcamp(int id, String name, int instuctorId, Date startDate, Date endDate, BootcampState bootcampState) {
        this.id = id;
        this.name = name;
        this.instuctorId = instuctorId;
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

    public int getInstuctorId() {
        return instuctorId;
    }

    public void setInstuctorId(int instuctorId) {
        this.instuctorId = instuctorId;
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
