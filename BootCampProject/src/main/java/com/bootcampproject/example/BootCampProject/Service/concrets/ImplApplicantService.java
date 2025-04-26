package com.bootcampproject.example.BootCampProject.Service.concrets;

import com.bootcampproject.example.BootCampProject.Repository.ApplicantRepository;
import com.bootcampproject.example.BootCampProject.Entity.Applicant;
import com.bootcampproject.example.BootCampProject.Service.abstracts.IApplicantService;
import com.bootcampproject.example.BootCampProject.Service.dtos.requests.applicant.CreateApplicantRequest;
import com.bootcampproject.example.BootCampProject.Service.dtos.requests.applicant.UpdateApplicantRequest;
import com.bootcampproject.example.BootCampProject.Service.dtos.responses.applicant.CreateApplicantResponse;
import com.bootcampproject.example.BootCampProject.Service.dtos.responses.applicant.GetApplicantResponse;
import com.bootcampproject.example.BootCampProject.Service.dtos.responses.applicant.GetListApplicantResponse;
import com.bootcampproject.example.BootCampProject.Service.dtos.responses.applicant.UpdatedApplicantResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ImplApplicantService implements IApplicantService {
    @Autowired
    private  final ApplicantRepository applicantRepository;

    public ImplApplicantService(ApplicantRepository applicantRepository) {
        this.applicantRepository = applicantRepository;
    }

    @Override
    public CreateApplicantResponse addApplicant(CreateApplicantRequest request) {
        Applicant applicant = new Applicant();
        applicant.setFirstName(request.getName());
        Applicant createdApplicat = applicantRepository.save(applicant);

        CreateApplicantResponse response = new CreateApplicantResponse();
        response.setId(createdApplicat.getId());
        response.setName(createdApplicat.getFirstName());

        return response;

    }

    @Override
    public void deleteApplicant(int id) {
        applicantRepository.deleteById(id);
    }

    @Override
    public UpdatedApplicantResponse updateApplicant(UpdateApplicantRequest request) {
        Applicant applicant = applicantRepository.findById(request.getId()).
                orElseThrow(() -> new RuntimeException("Applicant not found"));
        applicant.setFirstName(request.getName());
        applicant.setId(request.getId());

        Applicant updatedApplicat = applicantRepository.save(applicant);

        UpdatedApplicantResponse response = new UpdatedApplicantResponse();
        response.setId(updatedApplicat.getId());
        response.setName(updatedApplicat.getFirstName());
        return response;
    }

    @Override
    public List<GetListApplicantResponse> getAllApplicants() {
    return applicantRepository.findAll().stream()
            .map(this::mapToResponse).collect(Collectors.toList());
    }

    public GetListApplicantResponse mapToResponse(Applicant applicant) {
        GetListApplicantResponse response = new GetListApplicantResponse();
        response.setId(applicant.getId());
        response.setName(applicant.getFirstName());
        return response;
    }



    @Override
    public GetApplicantResponse getApplicantById(int id) {
        Applicant applicant = applicantRepository.findById(id).
                orElseThrow(()-> new RuntimeException("Applicant not found"));
        return  mapToApplicantResponse(applicant);

    }

    private GetApplicantResponse mapToApplicantResponse(Applicant applicant) {
        GetApplicantResponse response = new GetApplicantResponse();
        response.setId(applicant.getId());
        response.setName(applicant.getFirstName());
        return response;
    }
}
