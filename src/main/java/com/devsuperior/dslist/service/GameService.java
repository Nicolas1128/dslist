package com.devsuperior.dslist.service;

import com.devsuperior.dslist.entity.Game;
import com.devsuperior.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<Game> findAll() {
        return repository.findAll();
    }
}
