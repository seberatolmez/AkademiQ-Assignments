package com.bootcampproject.example.BootCampProject.Service.dtos.responses.applicant;

public class UpdatedApplicantResponse {
    private int id;
    private String name;

    public UpdatedApplicantResponse(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public UpdatedApplicantResponse() {

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
}
