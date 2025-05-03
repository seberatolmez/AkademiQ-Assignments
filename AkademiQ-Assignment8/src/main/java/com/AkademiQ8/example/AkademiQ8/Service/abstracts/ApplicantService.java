package com.AkademiQ8.example.AkademiQ8.Service.abstracts;

import com.AkademiQ8.example.AkademiQ8.Service.dto.request.CreateApplicationRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.DeleteApplicantRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.UpdateApplicationRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.CreatedAppliantResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.DeletedApplicantResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.GetApplicantResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.UpdatedApplicantResponse;

public interface ApplicantService {
    CreatedAppliantResponse createApplicant(CreateApplicationRequest request);
    UpdatedApplicantResponse updateApplicant(UpdateApplicationRequest request);
    void deleteApplicant (DeleteApplicantRequest request);
    GetApplicantResponse getApplicantByName(String name);


}
