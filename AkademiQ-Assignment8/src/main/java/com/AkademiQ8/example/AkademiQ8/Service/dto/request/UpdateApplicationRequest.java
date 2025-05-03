package com.AkademiQ8.example.AkademiQ8.Service.dto.request;

public class UpdateApplicationRequest {

    private int id;
    private String name;

    public UpdateApplicationRequest(int id, String name) {
        this.id = id;
        this.name = name;
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
