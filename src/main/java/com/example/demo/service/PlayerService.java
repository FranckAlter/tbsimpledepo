package com.example.demo.service;

import com.example.demo.domain.Card;
import com.example.demo.domain.Player;
import com.example.demo.repository.CardRepository;
import com.example.demo.repository.PlayerRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public Optional<Player> getPlayer(final Long id) {
        return playerRepository.findById(id);
    }

    public Iterable<Player> getPlayers() {
        return playerRepository.findAll();
    }

    public Player savePlayer(Player player) {Player savedPlayer = playerRepository.save(player);
        return savedPlayer;
    }

}
