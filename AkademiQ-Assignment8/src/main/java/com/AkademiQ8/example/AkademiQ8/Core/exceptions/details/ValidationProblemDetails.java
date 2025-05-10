package com.AkademiQ8.example.AkademiQ8.Core.exceptions.details;

import org.springframework.http.HttpStatus;

public class ValidationProblemDetails extends ProblemDetails {

    public ValidationProblemDetails() {
        setTitle("Validation Problem");
        setType("https://acunmedyaakademi/validate/");
        setStatus(HttpStatus.BAD_REQUEST.toString());
    }

}
