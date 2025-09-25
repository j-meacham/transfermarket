package com.transfermarket.market.service;

import com.transfermarket.market.dao.ClubRepository;
import com.transfermarket.market.entity.Club;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClubService {

    @Autowired
    private ClubRepository clubRepository;

    public Club getClubById(int clubId) {

        return clubRepository.findById(clubId).orElse(null);

    }

    public void add(Club club) {
        clubRepository.save(club);
    }
}
