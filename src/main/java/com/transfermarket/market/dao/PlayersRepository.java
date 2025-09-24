package com.transfermarket.market.dao;

import com.transfermarket.market.entity.Players;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayersRepository extends JpaRepository<Players, Integer> {

}
