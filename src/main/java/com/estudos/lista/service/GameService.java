package com.estudos.lista.service;

import com.estudos.lista.models.dto.GameCompletoDTO;
import com.estudos.lista.models.dto.GameMinDto;
import com.estudos.lista.models.entities.GameModel;
import com.estudos.lista.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll(){
      List<GameModel>  listaGame= gameRepository.findAll();
      List<GameMinDto> listaDto = listaGame.stream().map(x->new GameMinDto(x)).toList();
        return listaDto;

    }

    public GameCompletoDTO findGameById(Long id){
       GameModel gameModel= gameRepository.findById(id).get();
           return new GameCompletoDTO(gameModel);
    }

}
