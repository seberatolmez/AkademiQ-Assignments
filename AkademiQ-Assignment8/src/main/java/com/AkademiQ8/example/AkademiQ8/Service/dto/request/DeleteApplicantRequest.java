package com.AkademiQ8.example.AkademiQ8.Service.dto.request;

public class DeleteApplicantRequest {

    private  int id;

    public DeleteApplicantRequest(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
