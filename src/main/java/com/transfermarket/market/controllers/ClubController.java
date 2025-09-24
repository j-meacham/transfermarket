package com.transfermarket.market.controllers;

import com.transfermarket.market.entity.Club;
import com.transfermarket.market.entity.Players;
import com.transfermarket.market.service.ClubService;
import com.transfermarket.market.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClubController {

    private Club club;

    @Autowired
    private ClubService clubService;


    @Autowired
    public ClubController() {
        System.out.println("In constructor: " + getClass().getSimpleName());
        club = new Club("Nottm Forest", 010020201,10);
    }

    @GetMapping("/clubinfo/{clubId}")
    public String getClubInfo(@PathVariable Integer clubId) {

        return ClubService.getClubById(clubId).toString();

    }

    @GetMapping("/playerinfo/{playerId}")
    public String getPlayerInfo(@PathVariable Integer playerId) {

        return PlayerService.getPlayerById(playerId).toString();
    }

}
