package com.AkademiQ8.example.AkademiQ8.Service.concrets;

import com.AkademiQ8.example.AkademiQ8.Service.abstracts.BootcampService;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.CreatetBootcampRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.DeleteBootcampRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.UpdateBootcampRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.CreatedBootcampResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.DeletedBootcampResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.GetBootcampResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.UpdatedBootcampResponse;
import org.springframework.stereotype.Service;

@Service
public class BootcampServiceImpl implements BootcampService {
    @Override
    public CreatedBootcampResponse createBootcamp(CreatetBootcampRequest request) {
        return null;
    }

    @Override
    public UpdatedBootcampResponse updateBootcamp(UpdateBootcampRequest request) {
        return null;
    }

    @Override
    public DeletedBootcampResponse deleteBootcamp(DeleteBootcampRequest request) {
        return null;
    }

    @Override
    public GetBootcampResponse getBootCampById(int id) {
        return null;
    }
}
