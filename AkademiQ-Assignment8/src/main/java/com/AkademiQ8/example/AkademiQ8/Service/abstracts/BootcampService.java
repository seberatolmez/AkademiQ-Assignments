package com.AkademiQ8.example.AkademiQ8.Service.abstracts;

import com.AkademiQ8.example.AkademiQ8.Service.dto.request.CreatetBootcampRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.DeleteBootcampRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.UpdateBootcampRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.CreatedBootcampResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.DeletedBootcampResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.GetBootcampResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.UpdatedBootcampResponse;

public interface BootcampService {
    CreatedBootcampResponse createBootcamp(CreatetBootcampRequest request);
    UpdatedBootcampResponse updateBootcamp(UpdateBootcampRequest request);
    DeletedBootcampResponse deleteBootcamp(DeleteBootcampRequest request);
    GetBootcampResponse getBootCampById(int id);

}
