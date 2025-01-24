package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entity.Game;
import lombok.Data;

@Data
public class GameDto {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameDto(Game game) {
        id = game.getId();
        title = game.getTitle();
        year = game.getYear();
        imgUrl = game.getImgUrl();
        shortDescription = game.getShortDescription();
    }
}
