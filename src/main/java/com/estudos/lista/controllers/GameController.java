package com.estudos.lista.controllers;

import com.estudos.lista.models.dto.GameMinDto;
import com.estudos.lista.models.entities.GameModel;
import com.estudos.lista.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping()
    public List<GameMinDto> listaGames(){

        return gameService.findAll();
    }

}
