package com.AkademiQ8.example.AkademiQ8.Service.Rules;

import com.AkademiQ8.example.AkademiQ8.Core.exceptions.types.BusinessException;
import com.AkademiQ8.example.AkademiQ8.Entity.Applicant;
import com.AkademiQ8.example.AkademiQ8.Repository.ApplicationRepository;
import com.AkademiQ8.example.AkademiQ8.Repository.BlacklistRepositoryt;

import java.util.ArrayList;
import java.util.List;

public class ApplicantBusinessRule {

    private List<Applicant> applicants;
    private ApplicationRepository repository;
    private BlacklistRepositoryt repositoryBlacklist;

    public ApplicantBusinessRule(ApplicationRepository repository) {
        applicants = new ArrayList<Applicant>();
        this.repository = repository;
    }

    public void ifApplicantAlreadyExists(Applicant applicant) {
        if (!applicants.contains(applicant)) {
            throw new BusinessException("Applican already exists");
        }
    }

    public void ifApplicantExistsInBlacklist(Applicant applicant) {
        if (repositoryBlacklist.findById(applicant.getId()).isPresent()) {
            throw new BusinessException("Applicant exists in blacklist");
        }
    }

    public void ifApplicantDoesNotExist(Applicant applicant) {
        if (repository.findById(applicant.getId()).isEmpty()) {
            throw new BusinessException("Applicant does not exist");
        }
    }



}
