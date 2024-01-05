package com.estudos.lista.controllers;

import com.estudos.lista.models.dto.GameCompletoDTO;
import com.estudos.lista.models.dto.GameMinDto;
import com.estudos.lista.models.entities.GameModel;
import com.estudos.lista.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping()
    public List<GameMinDto> listaGames(){

        return gameService.findAll();
    }

    @GetMapping("/{id}")
    public GameCompletoDTO buscaGamePorId(@PathVariable Long id){
        return gameService.findGameById(id);
    }



}
