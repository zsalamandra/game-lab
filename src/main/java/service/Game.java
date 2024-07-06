package service;

import lombok.Data;

@Data
public class Game {

    private Integer id;
    private String name;
    private GameGenre gameGenre;
    private Double price;

    public Game(String name, GameGenre gameGenre, Double price) {

        this.id = IdGenerator.incGameId();
        this.name = name;
        this.gameGenre = gameGenre;
        this.price = price;
    }
}
