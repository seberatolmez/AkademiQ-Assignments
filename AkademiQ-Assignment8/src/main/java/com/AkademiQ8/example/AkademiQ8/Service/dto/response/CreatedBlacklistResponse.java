package com.AkademiQ8.example.AkademiQ8.Service.dto.response;

public class CreatedBlacklistResponse {
    private int id;
    private String name;

    public CreatedBlacklistResponse(int id, String name) {
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
