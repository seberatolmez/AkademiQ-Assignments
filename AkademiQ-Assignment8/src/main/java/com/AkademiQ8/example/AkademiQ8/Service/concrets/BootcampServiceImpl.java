package com.AkademiQ8.example.AkademiQ8.Service.concrets;

import com.AkademiQ8.example.AkademiQ8.Entity.Bootcamp;
import com.AkademiQ8.example.AkademiQ8.Mapper.BootcampMapper;
import com.AkademiQ8.example.AkademiQ8.Repository.BootcampRepository;
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
    private final BootcampRepository bootcampRepository;
    private final BootcampMapper mapper;

    public BootcampServiceImpl(BootcampRepository bootcampRepository, BootcampMapper mapper) {
        this.bootcampRepository = bootcampRepository;
        this.mapper = mapper;
    }

    @Override
    public CreatedBootcampResponse createBootcamp(CreatetBootcampRequest request) {
        Bootcamp bootcamp = mapper.bootcampFromCreateBootcampRequest(request);
        Bootcamp createdBootcamp = bootcampRepository.save(bootcamp);

        return mapper.createResponseFromBootcamp(createdBootcamp);
    }

    @Override
    public UpdatedBootcampResponse updateBootcamp(UpdateBootcampRequest request) {
        Bootcamp bootcamp = bootcampRepository.findById(request.getId());
        bootcamp.setName(request.getName());
        bootcampRepository.save(bootcamp);
        return mapper.updateResponseFromBootcamp(bootcamp);
    }

    @Override
    public void deleteBootcamp(DeleteBootcampRequest request) {
        Bootcamp bootcamp = bootcampRepository.findById(request.getId());
        bootcampRepository.delete(bootcamp);
    }

    @Override
    public GetBootcampResponse getBootCampById(int id) {
        Bootcamp bootcamp = bootcampRepository.findById(id);
        return mapper.getResponseFromBootcamp(bootcamp);
    }

}