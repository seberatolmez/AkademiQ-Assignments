package com.AkademiQ8.example.AkademiQ8.Controller;

import com.AkademiQ8.example.AkademiQ8.Service.abstracts.BootcampService;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.CreatetBootcampRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.DeleteBootcampRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.request.UpdateBootcampRequest;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.CreatedBootcampResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.GetBootcampResponse;
import com.AkademiQ8.example.AkademiQ8.Service.dto.response.UpdatedBootcampResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/bootcamps")
public class BootcampController {

    private final BootcampService service;

    public BootcampController(BootcampService service) {
        this.service = service;
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreatedBootcampResponse createBootcamp(@RequestBody CreatetBootcampRequest request) {
        return service.createBootcamp(request);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public UpdatedBootcampResponse updateBootcamp(@RequestBody UpdateBootcampRequest request) {
        return service.updateBootcamp(request);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public GetBootcampResponse getBootcampById(@PathVariable int id) {
        return service.getBootCampById(id);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBootcampById(@RequestBody DeleteBootcampRequest request) {
        service.deleteBootcamp(request);
    }

}
