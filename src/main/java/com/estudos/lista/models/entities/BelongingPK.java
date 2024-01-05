package com.estudos.lista.models.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BelongingPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "game_id")
    private  GameModel gameModel;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameListModel gameListModel;

    public BelongingPK() {
    }

    public BelongingPK(GameModel gameModel, GameListModel gameListModel) {
        this.gameModel = gameModel;
        this.gameListModel = gameListModel;
    }

    public GameModel getGameModel() {
        return gameModel;
    }

    public void setGameModel(GameModel gameModel) {
        this.gameModel = gameModel;
    }

    public GameListModel getGameListModel() {
        return gameListModel;
    }

    public void setGameListModel(GameListModel gameListModel) {
        this.gameListModel = gameListModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(gameModel, that.gameModel) && Objects.equals(gameListModel, that.gameListModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameModel, gameListModel);
    }
}
