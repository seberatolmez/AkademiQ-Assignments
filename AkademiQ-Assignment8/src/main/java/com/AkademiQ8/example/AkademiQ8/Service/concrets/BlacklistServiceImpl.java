package com.AkademiQ8.example.AkademiQ8.Service.concrets;

import com.AkademiQ8.example.AkademiQ8.Service.abstracts.BlacklistService;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.CreateBlackListRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.DeleteBlacklistRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.UpdateBlacklistRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.CreatedBlacklistResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.DeletedBlacklistResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.GetBlacklistResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.UpdatedBlacklistResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlacklistServiceImpl implements BlacklistService {
    @Override
    public CreatedBlacklistResponse createBlacklist(CreateBlackListRequest request) {
        return null;
    }

    @Override
    public UpdatedBlacklistResponse updateBlackList(UpdateBlacklistRequest request) {
        return null;
    }

    @Override
    public DeletedBlacklistResponse deleteBlacklist(DeleteBlacklistRequest request) {
        return null;
    }

    @Override
    public List<GetBlacklistResponse> getCreatedBlacklist(int id) {
        return List.of();
    }
}
