package com.estudos.lista.service;

import com.estudos.lista.models.dto.GameMinDto;
import com.estudos.lista.models.entities.GameModel;
import com.estudos.lista.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll(){
      List<GameModel>  listaGame= gameRepository.findAll();
      List<GameMinDto> listaDto = listaGame.stream().map(x->new GameMinDto(x)).toList();
        return listaDto;

    }

}
