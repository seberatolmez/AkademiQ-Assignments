package com.AkademiQ8.example.AkademiQ8.Service.dto.request;

public class CreateBlackListRequest {


    private String name;

    public CreateBlackListRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
