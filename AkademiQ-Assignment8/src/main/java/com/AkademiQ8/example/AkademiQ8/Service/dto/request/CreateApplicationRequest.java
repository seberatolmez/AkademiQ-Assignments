package com.AkademiQ8.example.AkademiQ8.Service.dto.request;

public class CreateApplicationRequest {

    private String name;

    public CreateApplicationRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

