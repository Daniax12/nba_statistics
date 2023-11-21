package com.nba.statistics.service;

import com.nba.statistics.model.Passe;
import com.nba.statistics.model.Tirjoueur;
import com.nba.statistics.repository.PasseRepository;
import com.nba.statistics.repository.TirjoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TirjoueurService {
    private TirjoueurRepository tirjoueurRepository;

    @Autowired
    public TirjoueurService(TirjoueurRepository tirjoueurRepository) {
        this.tirjoueurRepository = tirjoueurRepository;
    }

    public List<Tirjoueur> getTirJoueurs() {
        return tirjoueurRepository.findAll();
    }

    public Tirjoueur getTirJoueurById(String idtirjoueur) {
        Optional<Tirjoueur> temp = tirjoueurRepository.findById(idtirjoueur);
        return temp.orElse(null);
    }

    public Tirjoueur createOrUpdateTirJoueur(Tirjoueur tirjoueur) {
        return tirjoueurRepository.save(tirjoueur);
    }
    public void deleteGame(String idtirjoueur) {
        tirjoueurRepository.deleteById(idtirjoueur);
    }
}
