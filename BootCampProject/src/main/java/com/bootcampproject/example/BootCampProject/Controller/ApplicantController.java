package com.bootcampproject.example.BootCampProject.Controller;

import com.bootcampproject.example.BootCampProject.Entity.Applicant;
import com.bootcampproject.example.BootCampProject.Service.concrets.ImplApplicantService;
import com.bootcampproject.example.BootCampProject.Service.dtos.requests.applicant.CreateApplicantRequest;
import com.bootcampproject.example.BootCampProject.Service.dtos.requests.applicant.UpdateApplicantRequest;
import com.bootcampproject.example.BootCampProject.Service.dtos.responses.applicant.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/applicants")
public class ApplicantController {

    private final ImplApplicantService service;
    public ApplicantController(ImplApplicantService service) {

        this.service = service;
    }


    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<GetListApplicantResponse> getAllApplicants() {

        return service.getAllApplicants();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public GetApplicantResponse getApplicantBy(@PathVariable int id){
        return service.getApplicantById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateApplicantResponse addApplicant(@RequestBody CreateApplicantRequest request){
        return service.addApplicant(request);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public UpdatedApplicantResponse updateApplicant(@RequestBody UpdateApplicantRequest request){
        return service.updateApplicant(request);
    }
    
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteApplicant(@PathVariable int id){
        service.deleteApplicant(id);
    }

}
