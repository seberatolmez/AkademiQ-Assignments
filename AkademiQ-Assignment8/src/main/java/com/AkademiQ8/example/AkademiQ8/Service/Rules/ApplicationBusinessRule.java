package com.AkademiQ8.example.AkademiQ8.Service.Rules;

import com.AkademiQ8.example.AkademiQ8.Core.enums.ApplicationState;
import com.AkademiQ8.example.AkademiQ8.Core.enums.BootcampState;
import com.AkademiQ8.example.AkademiQ8.Core.exceptions.types.BusinessException;
import com.AkademiQ8.example.AkademiQ8.Entity.Applicant;
import com.AkademiQ8.example.AkademiQ8.Entity.Application;
import com.AkademiQ8.example.AkademiQ8.Entity.Bootcamp;
import com.AkademiQ8.example.AkademiQ8.Repository.ApplicationRepository;
import com.AkademiQ8.example.AkademiQ8.Repository.BlacklistRepositoryt;

import java.util.List;
import java.util.Map;

public class ApplicationBusinessRule {

    private final ApplicationRepository repository;
    private final BlacklistRepositoryt blacklistRepository;
    public ApplicationBusinessRule(ApplicationRepository repository, BlacklistRepositoryt blacklistRepository) {
        this.repository = repository;
        this.blacklistRepository = blacklistRepository;
    }

    public void ifApplicantAlreadyExists(Application application, Applicant applicant) {
        if (!repository.findApplicationByApplicantName(applicant.getName()).isEmpty()) {
            throw new BusinessException("Applicant already exists");
        }
    }

    public void ifApplicationIsClosed(Bootcamp bootcamp) {
        if (bootcamp.getBootcampState() == BootcampState.CLOSED) {
            throw new BusinessException("Application is not active");
        }
    }

    public void ifApplicantExistsInBlacklist(Applicant applicant) {
        if (blacklistRepository.findById(applicant.getId()).isPresent()) {
            throw new BusinessException("Unfortunately,Applicant exists in blacklist");
        }
    }

    public void  applicationStatusChangingRules(Application application, ApplicationState state) {
        if (!canTransition(application.getApplicationState(), state)) {
            throw new BusinessException("This state change is not allowed");
        }
    }

    private static final Map<ApplicationState, List<ApplicationState>> allowedTransitions = Map.of(
            ApplicationState.PENDİNG, List.of(ApplicationState.APPROVED,ApplicationState.REJECTED,
                    ApplicationState.CANCELED,ApplicationState.IN_REVİEW)
            ,
            ApplicationState.APPROVED, List.of(ApplicationState.CANCELED),
            ApplicationState.IN_REVİEW, List.of(ApplicationState.APPROVED,ApplicationState.REJECTED, ApplicationState.CANCELED),
            ApplicationState.REJECTED, List.of(),
            ApplicationState.CANCELED, List.of()

    );

    boolean canTransition(ApplicationState current, ApplicationState next) {
        List<ApplicationState> allowed = allowedTransitions.getOrDefault(current, List.of());
        return allowed.contains(next);
    }


}
