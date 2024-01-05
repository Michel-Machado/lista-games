package com.estudos.lista.models.dto;


import com.estudos.lista.models.entities.GameModel;

public class GameMinDto {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDto() {
    }

    public GameMinDto(GameModel gameModel) {
        id = gameModel.getId();
        title =  gameModel.getTitle();
        year = gameModel.getYear(); ;
        imgUrl = gameModel.getImgUrl();
        shortDescription = gameModel.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}


