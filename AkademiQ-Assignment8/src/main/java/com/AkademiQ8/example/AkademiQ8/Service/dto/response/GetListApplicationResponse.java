package com.AkademiQ8.example.AkademiQ8.Service.dto.response;

public class GetListApplicationResponse {

    private int id ;
    private String name ;
    private  int applicationId ;
    private String applicationName ;

    public GetListApplicationResponse(int id, String name) {
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
