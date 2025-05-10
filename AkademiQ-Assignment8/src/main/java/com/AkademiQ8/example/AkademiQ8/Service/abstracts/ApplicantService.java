package com.AkademiQ8.example.AkademiQ8.Service.abstracts;

import com.AkademiQ8.example.AkademiQ8.Service.dto.request.CreateApplicationRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.DeleteApplicantRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.UpdateApplicationRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.*;

import java.util.List;

public interface ApplicantService {
    CreatedAppliantResponse createApplicant(CreateApplicationRequest request);
    UpdatedApplicantResponse updateApplicant(UpdateApplicationRequest request);
    void deleteApplicant (DeleteApplicantRequest request);
    GetApplicantResponse getApplicantByName(String name);
    DeletedApplicantResponse softDelete(int id );

    List<GetListApplicationResponse> findApplicationsByApplicanName(String name);


}
