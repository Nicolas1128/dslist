package com.devsuperior.dslist.controller;

import com.devsuperior.dslist.dto.GameDto;
import com.devsuperior.dslist.entity.Game;
import com.devsuperior.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping()
    public ResponseEntity<List<Game>> findAll() {
        List<Game> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
