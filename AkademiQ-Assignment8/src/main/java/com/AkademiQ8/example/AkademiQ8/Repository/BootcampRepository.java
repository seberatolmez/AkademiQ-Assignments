package com.AkademiQ8.example.AkademiQ8.Repository;

import com.AkademiQ8.example.AkademiQ8.Entity.Bootcamp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BootcampRepository extends JpaRepository<Bootcamp, Integer> {
   Bootcamp findById(int id);

   @Query("select b from Bootcamp b where b.name =: brandName")
   Bootcamp findByName(String name);
}
