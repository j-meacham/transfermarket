package com.transfermarket.market.service;

import com.transfermarket.market.dao.PlayersRepository;
import com.transfermarket.market.entity.Players;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    @Autowired
    private PlayersRepository playersRepository;

    public Players getPlayerById(int playerId) {

        return playersRepository.findById(playerId).orElse(null);

    }

    public void add(Players player) {
        playersRepository.save(player);
    }
}
