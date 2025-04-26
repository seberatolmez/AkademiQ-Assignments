package com.bootcampproject.example.BootCampProject.Service.abstracts;

import com.bootcampproject.example.BootCampProject.Entity.Applicant;
import com.bootcampproject.example.BootCampProject.Service.dtos.requests.applicant.CreateApplicantRequest;
import com.bootcampproject.example.BootCampProject.Service.dtos.requests.applicant.UpdateApplicantRequest;
import com.bootcampproject.example.BootCampProject.Service.dtos.responses.applicant.CreateApplicantResponse;
import com.bootcampproject.example.BootCampProject.Service.dtos.responses.applicant.GetApplicantResponse;
import com.bootcampproject.example.BootCampProject.Service.dtos.responses.applicant.GetListApplicantResponse;
import com.bootcampproject.example.BootCampProject.Service.dtos.responses.applicant.UpdatedApplicantResponse;

import java.util.List;

public interface IApplicantService {

    CreateApplicantResponse addApplicant(CreateApplicantRequest request);
    void deleteApplicant(int id);
    UpdatedApplicantResponse updateApplicant(UpdateApplicantRequest request);
    List<GetListApplicantResponse> getAllApplicants();
    GetApplicantResponse getApplicantById(int id);
}
