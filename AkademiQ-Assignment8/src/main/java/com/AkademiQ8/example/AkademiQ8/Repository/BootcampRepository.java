package com.AkademiQ8.example.AkademiQ8.Repository;

import com.AkademiQ8.example.AkademiQ8.Entity.Bootcamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BootcampRepository extends JpaRepository<Bootcamp, Integer> {
    Bootcamp findById(int id);
}
