package com.AkademiQ8.example.AkademiQ8.Core.exceptions.details;

import com.sun.net.httpserver.HttpsServer;
import org.springframework.http.HttpStatus;

public class BusinessProblemDetails extends ProblemDetails {


   public BusinessProblemDetails() {
       setTitle("Business Problem Details");
       setType("htttps://acunmedyaakademi/businessproblem");
       setStatus(HttpStatus.BAD_REQUEST.toString());

   }
}
