package com.AkademiQ8.example.AkademiQ8.Core.exceptions.details;

import org.springframework.http.HttpStatus;

public class InternalServerProblemDetails extends ProblemDetails{

    public InternalServerProblemDetails() {
        setTitle("Internal Server Error");
        setType("https://acunmedyaakademi/serverproblems");
        setStatus(HttpStatus.INTERNAL_SERVER_ERROR.toString());
    }
}
