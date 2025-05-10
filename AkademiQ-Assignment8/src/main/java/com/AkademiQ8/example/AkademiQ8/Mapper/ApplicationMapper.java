package com.AkademiQ8.example.AkademiQ8.Mapper;

import com.AkademiQ8.example.AkademiQ8.Entity.Application;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.CreateApplicationRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.*;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ApplicationMapper {

    ApplicationMapper INSTANCE = Mappers.getMapper(ApplicationMapper.class);
    Application createApplicationFromReques(CreateApplicationRequest createApplicationRequest);
    CreatedAppliantResponse createResponseFromApplication(Application application);
    UpdatedApplicantResponse updateResponseFromApplication (Application application);
    GetApplicantResponse getResponseFromApplication (Application application);
    DeletedApplicantResponse deleteResponseFromApplication (Application application);
    GetListApplicationResponse getListApplicationResponseFromApplication (Application application);
}
