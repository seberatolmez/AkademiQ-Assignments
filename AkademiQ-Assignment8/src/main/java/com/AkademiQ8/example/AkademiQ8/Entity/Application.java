package com.AkademiQ8.example.AkademiQ8.Entity;

import com.AkademiQ8.example.AkademiQ8.Core.enums.ApplicationState;
import com.AkademiQ8.example.AkademiQ8.Core.entity.BaseEntity;
import jakarta.persistence.*;

@Entity
public class Application extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "applicantId")
    private Applicant applicant;

    @ManyToOne
    @JoinColumn(name = "bootcampId")
    private Bootcamp bootcamp;

    @Enumerated(EnumType.STRING)
    private ApplicationState applicationState;

    public Application() {
    }

    public Application(Applicant applicant, Bootcamp bootcamp, ApplicationState applicationState) {
        this.applicant = applicant;
        this.bootcamp = bootcamp;
        this.applicationState = applicationState;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public Bootcamp getBootcamp() {
        return bootcamp;
    }

    public void setBootcamp(Bootcamp bootcamp) {
        this.bootcamp = bootcamp;
    }

    public ApplicationState getApplicationState() {
        return applicationState;
    }

    public void setApplicationState(ApplicationState applicationState) {
        this.applicationState = applicationState;
    }
}
