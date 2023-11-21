package com.nba.statistics.service;

import com.nba.statistics.model.Game;
import com.nba.statistics.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {
    private GameRepository gameRepository;

    @Autowired
    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<Game> getGames() {
        return gameRepository.findAll();
    }

    public Game getGameById(String idgame) {
        Optional<Game> temp = gameRepository.findById(idgame);
        return temp.orElse(null);
    }

    public Game createOrUpdateGame(Game game) {
        return gameRepository.save(game);
    }

    public void deleteGame(String idgame) {
        gameRepository.deleteById(idgame);
    }
}
