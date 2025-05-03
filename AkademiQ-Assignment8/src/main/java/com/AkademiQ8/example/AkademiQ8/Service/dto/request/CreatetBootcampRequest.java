package com.AkademiQ8.example.AkademiQ8.Service.dto.request;

public class CreatetBootcampRequest {


    private String name;

    public CreatetBootcampRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
