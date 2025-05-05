package com.AkademiQ8.example.AkademiQ8.Controller;

import com.AkademiQ8.example.AkademiQ8.Service.abstracts.BlacklistService;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.CreateBlackListRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.DeleteBlacklistRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.UpdateBlacklistRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.CreatedBlacklistResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.GetBlacklistResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.UpdatedBlacklistResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/blaklists")
public class BlacklistController {

    private final BlacklistService service;

    public BlacklistController(BlacklistService service) {
        this.service = service;
    }
    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreatedBlacklistResponse createBlacklist(@RequestBody CreateBlackListRequest request) {
        return service.createBlacklist(request);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public UpdatedBlacklistResponse updateBlacklist(@RequestBody UpdateBlacklistRequest request) {
        return  service.updateBlackList(request);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBlaklist(@RequestBody DeleteBlacklistRequest request) { // no need request pattern id is enough normally
        service.deleteBlacklist(request);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<GetBlacklistResponse> getBlacklist( int id) {
        return service.getCreatedBlacklist(id);
    }


}
