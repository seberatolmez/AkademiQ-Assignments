package com.AkademiQ8.example.AkademiQ8.Service.dto.request;

public class DeleteBootcampRequest {

    private  int id;

    public DeleteBootcampRequest(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
