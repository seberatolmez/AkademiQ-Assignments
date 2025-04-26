package com.bootcampproject.example.BootCampProject.Repository;

import com.bootcampproject.example.BootCampProject.Core.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepository extends JpaRepository<User,Integer> {
}
