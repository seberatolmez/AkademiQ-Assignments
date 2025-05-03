package com.AkademiQ8.example.AkademiQ8.Service.abstracts;

import com.AkademiQ8.example.AkademiQ8.Service.dto.request.CreateBlackListRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.DeleteBlacklistRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.UpdateBlacklistRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.CreatedBlacklistResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.DeletedBlacklistResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.GetBlacklistResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.UpdatedBlacklistResponse;

import java.util.List;

public interface BlacklistService {


    CreatedBlacklistResponse createBlacklist(CreateBlackListRequest request);
    UpdatedBlacklistResponse updateBlackList(UpdateBlacklistRequest request);
    DeletedBlacklistResponse deleteBlacklist(DeleteBlacklistRequest request);
    List<GetBlacklistResponse> getCreatedBlacklist(int id );
}
