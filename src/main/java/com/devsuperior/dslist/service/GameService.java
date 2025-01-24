package com.devsuperior.dslist.service;

import com.devsuperior.dslist.dto.GameDto;
import com.devsuperior.dslist.entity.Game;
import com.devsuperior.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameDto> findAll() {
        List<Game> result = repository.findAll();
        return result
                .stream()
                .map(x -> new GameDto(x))
                .toList();
    }
}
