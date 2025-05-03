package com.AkademiQ8.example.AkademiQ8.Repository;

import com.AkademiQ8.example.AkademiQ8.Entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Integer> {
    Application findByName(String name);
}
