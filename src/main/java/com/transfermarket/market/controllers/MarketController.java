package com.transfermarket.market.controllers;

import com.transfermarket.market.entity.Club;
import com.transfermarket.market.entity.Players;
import com.transfermarket.market.service.ClubService;
import com.transfermarket.market.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarketController {
    @Autowired
    private ClubService clubService;

    @Autowired
    private PlayerService playerService;


    @Autowired
    public MarketController() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @GetMapping("/clubinfo/{clubId}")
    public String getClubInfo(@PathVariable Integer clubId) {

        if (getClubById(clubId) == null) {
            return "Club not found";
        } else {
            return getClubById(clubId).toString();
        }

    }

    @GetMapping("/playerinfo/{playerId}")
    public String getPlayerInfo(@PathVariable Integer playerId) {

        if (getPlayerById(playerId) == null) {
            return "Player not found";
        } else {
            return getPlayerById(playerId).toString();
        }
    }

    private Players getPlayerById(int playerId) {
        return playerService.getPlayerById(playerId);
    }

    private Club getClubById(int clubId) {
        return clubService.getClubById(clubId);
    }

}
