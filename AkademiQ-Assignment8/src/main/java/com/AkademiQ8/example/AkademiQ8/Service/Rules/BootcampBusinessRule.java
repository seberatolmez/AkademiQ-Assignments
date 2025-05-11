package com.AkademiQ8.example.AkademiQ8.Service.Rules;

import com.AkademiQ8.example.AkademiQ8.Core.enums.BootcampState;
import com.AkademiQ8.example.AkademiQ8.Core.exceptions.types.BusinessException;
import com.AkademiQ8.example.AkademiQ8.Entity.Bootcamp;
import com.AkademiQ8.example.AkademiQ8.Repository.BootcampRepository;

import java.time.LocalDateTime;

public class BootcampBusinessRule {

    private final BootcampRepository repository;

    public BootcampBusinessRule(BootcampRepository repository) {
        this.repository = repository;
    }

    public void ifStartDateIsAfterEndDay(LocalDateTime startDate, LocalDateTime endDate) {
        if (startDate.isAfter(endDate)) {
            throw new BusinessException("Bootcamp dates should be organized ");
        }
    }

    public void ifBootcampAlreadyExists(String name) {
        Bootcamp bootcamp = repository.findByName(name);
        if (bootcamp != null) {
            throw new BusinessException("This bootcamp name already exists");
        }
    }

    public void ifInstructorDoesNotExist(Bootcamp bootcamp) {
        if (bootcamp.getInstructor().getName().isEmpty()) {
            throw new BusinessException("Bootcamp does not have instructor");
        }
    }

    public void ifBootcampIsClosed(Bootcamp bootcamp) {
        if (bootcamp.getBootcampState() == BootcampState.CLOSED){
            throw new BusinessException("Bootcamp is closed");
        }
    }
}
