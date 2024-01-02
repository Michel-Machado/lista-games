package com.estudos.lista.repositories;

import com.estudos.lista.models.entities.GameModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<GameModel, Long> {

}
