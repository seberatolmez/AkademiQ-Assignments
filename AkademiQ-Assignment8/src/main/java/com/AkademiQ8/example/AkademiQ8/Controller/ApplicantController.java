package com.AkademiQ8.example.AkademiQ8.Controller;

import com.AkademiQ8.example.AkademiQ8.Service.abstracts.ApplicantService;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.CreateApplicationRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.DeleteApplicantRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.UpdateApplicationRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.CreatedAppliantResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.GetApplicantResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.GetListApplicationResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.UpdatedApplicantResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/applicants")
public class ApplicantController {
    private final ApplicantService service;
    public ApplicantController(ApplicantService service){

        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreatedAppliantResponse createApplicant(@RequestBody CreateApplicationRequest request){
        return service.createApplicant(request);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleteApplicant(@RequestBody DeleteApplicantRequest request){
        service.deleteApplicant(request);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public UpdatedApplicantResponse updateApplicant(@RequestBody UpdateApplicationRequest request){
        return  service.updateApplicant(request);
    }

    @GetMapping("/{name}")
    @ResponseStatus(HttpStatus.OK)
    public GetApplicantResponse getApplicantByName(@PathVariable String name){
        return service.getApplicantByName(name);
    }

    @GetMapping("applications/{name}")
    @ResponseStatus(HttpStatus.OK)
    public List<GetListApplicationResponse> getApplicationByApplicantName(@PathVariable String name) {
        return service.findApplicationsByApplicanName(name);
    }


}
