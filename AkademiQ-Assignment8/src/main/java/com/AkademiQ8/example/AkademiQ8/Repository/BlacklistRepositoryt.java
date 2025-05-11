package com.AkademiQ8.example.AkademiQ8.Repository;

import com.AkademiQ8.example.AkademiQ8.Entity.Blacklist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BlacklistRepositoryt extends JpaRepository<Blacklist, Integer> {
    Optional<Blacklist> findBlacklistById(int blacklistId);

    List<Blacklist> findBlacklistByUserId(int userId);

}
