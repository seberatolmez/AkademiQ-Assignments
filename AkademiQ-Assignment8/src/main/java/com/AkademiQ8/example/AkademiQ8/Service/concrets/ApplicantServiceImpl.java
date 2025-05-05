package com.AkademiQ8.example.AkademiQ8.Service.concrets;

import com.AkademiQ8.example.AkademiQ8.Entity.Applicant;
import com.AkademiQ8.example.AkademiQ8.Entity.Application;
import com.AkademiQ8.example.AkademiQ8.Mapper.ApplicationMapper;
import com.AkademiQ8.example.AkademiQ8.Repository.ApplicationRepository;
import com.AkademiQ8.example.AkademiQ8.Service.abstracts.ApplicantService;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.CreateApplicationRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.DeleteApplicantRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.UpdateApplicationRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.*;
import org.springframework.stereotype.Service;

@Service
public class ApplicantServiceImpl implements ApplicantService {

    private final ApplicationRepository repository;
    private final ApplicationMapper mapper;

    public ApplicantServiceImpl(ApplicationRepository repository,ApplicationMapper mapper) {

        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public CreatedAppliantResponse createApplicant(CreateApplicationRequest request) {
        Application application = mapper.createApplicationFromReques(request);
        Application createdApplication = repository.save(application);

        CreatedAppliantResponse response = mapper.createResponseFromApplication(createdApplication);
        return response;
    }

    @Override
    public UpdatedApplicantResponse updateApplicant(UpdateApplicationRequest request) {
        Application application = repository.findById(request.getId()).
                orElseThrow(()-> new RuntimeException("Applicant not found"));
        UpdatedApplicantResponse response = mapper.updateResponseFromApplication(application);
        return response;
    }

    @Override
    public void deleteApplicant(DeleteApplicantRequest request) {
        Application application = repository.findById(request.getId())
                .orElseThrow(()-> new RuntimeException("Applicant not found"));

        repository.delete(application);
    }

    @Override
    public GetApplicantResponse getApplicantByName(String name) {
        Application application = repository.findByName(name);
        GetApplicantResponse response = mapper.getResponseFromApplication(application);
        return response;
    }

    // kodun okunaklı olması açısından direk return etmek yerine yeni response objeleri oluşturuldu .
}
