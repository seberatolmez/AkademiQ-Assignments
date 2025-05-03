package com.AkademiQ8.example.AkademiQ8.Mapper;

import com.AkademiQ8.example.AkademiQ8.Entity.Bootcamp;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.CreatetBootcampRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.CreatedBootcampResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.GetBootcampResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.UpdatedBootcampResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BootcampMapper {
    BootcampMapper INSTANCE = Mappers.getMapper(BootcampMapper.class);
    Bootcamp bootcampFromCreateBootcampRequest(CreatetBootcampRequest request);
    CreatedBootcampResponse createResponseFromBootcamp(Bootcamp bootcamp);
    UpdatedBootcampResponse updateResponseFromBootcamp(Bootcamp bootcamp);
    GetBootcampResponse getResponseFromBootcamp(Bootcamp bootcamp);

}
