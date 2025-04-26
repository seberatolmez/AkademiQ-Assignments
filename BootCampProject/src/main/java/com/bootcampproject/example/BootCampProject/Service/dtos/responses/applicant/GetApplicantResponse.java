package com.bootcampproject.example.BootCampProject.Service.dtos.responses.applicant;

public class GetApplicantResponse {

    private int id;
    private String name;

    public GetApplicantResponse(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public GetApplicantResponse() {

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
