package com.AkademiQ8.example.AkademiQ8.Mapper;

import com.AkademiQ8.example.AkademiQ8.Entity.Blacklist;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.CreateBlackListRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.CreatedBlacklistResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.GetBlacklistResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.UpdatedBlacklistResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BlacklistMapper {
    BlacklistMapper INSTANCE = Mappers.getMapper(BlacklistMapper.class);
    Blacklist createBlackListFromRequest(CreateBlackListRequest request);
    CreatedBlacklistResponse createResponseFromBlackList(Blacklist blacklist);
    UpdatedBlacklistResponse updateResponseFromBlackList(Blacklist blacklist);
    GetBlacklistResponse getResponseFromBlackList(Blacklist blacklist);

}
