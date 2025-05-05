package com.AkademiQ8.example.AkademiQ8.Service.concrets;

import com.AkademiQ8.example.AkademiQ8.Entity.Blacklist;
import com.AkademiQ8.example.AkademiQ8.Mapper.BlacklistMapper;
import com.AkademiQ8.example.AkademiQ8.Repository.BlacklistRepositoryt;
import com.AkademiQ8.example.AkademiQ8.Service.abstracts.BlacklistService;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.CreateBlackListRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.DeleteBlacklistRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.UpdateBlacklistRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.CreatedBlacklistResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.DeletedBlacklistResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.GetBlacklistResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.UpdatedBlacklistResponse;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BlacklistServiceImpl implements BlacklistService {
    private  final BlacklistRepositoryt repository;
    private final BlacklistMapper mapper ;

    public BlacklistServiceImpl(BlacklistRepositoryt repository,BlacklistMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public CreatedBlacklistResponse createBlacklist(CreateBlackListRequest request) {
        Blacklist blacklist = mapper.createBlackListFromRequest(request);
        Blacklist createdBlacklist = repository.save(blacklist);

        return mapper.createResponseFromBlackList(createdBlacklist);
    }

    @Override
    public UpdatedBlacklistResponse updateBlackList(UpdateBlacklistRequest request) {
        Blacklist blacklist = repository.findById(request.getId())
                .orElseThrow(() -> new RuntimeException("Blacklist kaydı bulunamadı"));
        return mapper.updateResponseFromBlackList(blacklist);
    }

    @Override
    public void deleteBlacklist(DeleteBlacklistRequest request) {
        repository.deleteById(request.getId());

    }

    @Override
    public List<GetBlacklistResponse> getCreatedBlacklist(int id) {
        return repository.findById(id).stream().
               map(mapper::getResponseFromBlackList).collect(Collectors.toList());
    }


}
