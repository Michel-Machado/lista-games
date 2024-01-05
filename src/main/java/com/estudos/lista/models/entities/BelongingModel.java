package com.estudos.lista.models.entities;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
public class BelongingModel {

    @EmbeddedId
    private BelongingPK id= new BelongingPK();
    private Integer position;
    public BelongingModel() {
    }

    public BelongingModel(GameModel gameModel, GameListModel gameListModel, Integer position) {
        id.setGameModel(gameModel);
        id.setGameListModel(gameListModel);
        this.position = position;
    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingModel that = (BelongingModel) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
