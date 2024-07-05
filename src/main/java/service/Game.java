package service;

import lombok.Data;

@Data
public class Game {

    private Integer id;
    private String name;
    private GameGenre gameGenre;

    public Game(String name, GameGenre gameGenre) {

        this.id = IdGenerator.incGameId();
        this.name = name;
        this.gameGenre = gameGenre;
    }
}
