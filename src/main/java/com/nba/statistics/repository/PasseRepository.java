package com.nba.statistics.repository;

import com.nba.statistics.model.Passe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PasseRepository extends JpaRepository<Passe, String> {
}
