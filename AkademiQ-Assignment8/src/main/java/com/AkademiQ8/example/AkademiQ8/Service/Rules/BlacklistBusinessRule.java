package com.AkademiQ8.example.AkademiQ8.Service.Rules;

import com.AkademiQ8.example.AkademiQ8.Core.exceptions.types.BusinessException;
import com.AkademiQ8.example.AkademiQ8.Entity.Applicant;
import com.AkademiQ8.example.AkademiQ8.Entity.Blacklist;
import com.AkademiQ8.example.AkademiQ8.Entity.Bootcamp;
import com.AkademiQ8.example.AkademiQ8.Repository.BlacklistRepositoryt;

public class BlacklistBusinessRule {

    private final BlacklistRepositoryt repository;

    public BlacklistBusinessRule(BlacklistRepositoryt repository) {
        this.repository = repository;
    }

    public void ifApplicantAlreadyExistInBlacklist(Applicant applicant) {
        if (!repository.findBlacklistByUserId(applicant.getId()).isEmpty()) {
            throw new BusinessException("Applicant already exist in blacklist");
        }
    }

    public void ifReasonIsEmpty(Blacklist blacklist) {
        if (!blacklist.getReason().isEmpty()) {
            throw new BusinessException("Reason is empty");
        }
    }
}
