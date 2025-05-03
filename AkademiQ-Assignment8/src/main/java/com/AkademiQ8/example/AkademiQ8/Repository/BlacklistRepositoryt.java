package com.AkademiQ8.example.AkademiQ8.Repository;

import com.AkademiQ8.example.AkademiQ8.Entity.Blacklist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlacklistRepositoryt extends JpaRepository<Blacklist, Integer> {
    List<Blacklist> findByBlacklistId(int blacklistId);
}
