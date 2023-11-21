package com.nba.statistics.service;

import com.nba.statistics.model.Game;
import com.nba.statistics.model.Passe;
import com.nba.statistics.repository.GameRepository;
import com.nba.statistics.repository.PasseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PasseService {
    private PasseRepository passeRepository;

    @Autowired
    public PasseService(PasseRepository passeRepository) {
        this.passeRepository = passeRepository;
    }

    public List<Passe> getGames() {
        return passeRepository.findAll();
    }

    public Passe getPasseById(String idpasse) {
        Optional<Passe> temp = passeRepository.findById(idpasse);
        return temp.orElse(null);
    }

    public Passe createOrUpdatePasse(Passe passe) {
        return passeRepository.save(passe);
    }

    public void deleteGame(String idpasse) {
        passeRepository.deleteById(idpasse);
    }
}
