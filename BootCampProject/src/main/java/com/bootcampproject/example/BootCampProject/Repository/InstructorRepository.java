package com.bootcampproject.example.BootCampProject.Repository;

import com.bootcampproject.example.BootCampProject.Entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstructorRepository extends JpaRepository<Instructor,Integer> {
}
