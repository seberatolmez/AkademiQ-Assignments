package com.bootcampproject.example.BootCampProject.Service.dtos.responses.applicant;

public class CreateApplicantResponse {

    private  int id;
    private  String name;

    public CreateApplicantResponse(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public CreateApplicantResponse() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
