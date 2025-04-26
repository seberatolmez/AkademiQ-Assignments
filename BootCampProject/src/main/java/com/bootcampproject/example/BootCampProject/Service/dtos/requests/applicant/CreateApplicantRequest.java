package com.bootcampproject.example.BootCampProject.Service.dtos.requests.applicant;

public class CreateApplicantRequest {
    private String name;

    public CreateApplicantRequest(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
