package com.AkademiQ8.example.AkademiQ8.Repository;

import com.AkademiQ8.example.AkademiQ8.Entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Integer> {
    Application findByName(String name);

    @Query("select a from Application a where a.applicant.name = :applicantName ") //JDBQL Query
    List<Application> findApplicationByApplicantName(@Param("applicantName") String name);

    /* @Query(value = "SELECT * from applicants")
        List<Application> findAll(); */
}
