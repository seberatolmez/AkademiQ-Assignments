package com.bootcampproject.example.BootCampProject.Repository;

import com.bootcampproject.example.BootCampProject.Entity.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Integer> {
}
