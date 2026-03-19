package com.lanaro0108.gamestore.repository;

import org.springframework.data.repository.CrudRepository;

import com.lanaro0108.gamestore.model.Game;

public interface GameRepository extends CrudRepository<Game,Integer>{
    
}
