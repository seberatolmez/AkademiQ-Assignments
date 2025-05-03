package com.AkademiQ8.example.AkademiQ8.Entity;

import com.AkademiQ8.example.AkademiQ8.Core.ApplicationState;
import jakarta.persistence.*;

@Entity
public class Application {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int applicantId;
    private int bootCampId;
    private ApplicationState applicationState;

    public Application(int id, int applicantId, int bootCampId, ApplicationState applicationState) {
        this.id = id;
        this.applicantId = applicantId;
        this.bootCampId = bootCampId;
        this.applicationState = applicationState;
    }

    public Application() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }

    public int getBootCampId() {
        return bootCampId;
    }

    public void setBootCampId(int bootCampId) {
        this.bootCampId = bootCampId;
    }

    public ApplicationState getApplicationState() {
        return applicationState;
    }

    public void setApplicationState(ApplicationState applicationState) {
        this.applicationState = applicationState;
    }
}
