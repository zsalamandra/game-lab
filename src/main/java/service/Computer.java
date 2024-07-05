package service;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private Integer id;
    private List<Game> games;

    @Getter
    @Setter
    private Boolean isAvailable;

    public Computer() {

        this.id = IdGenerator.incComputerId();
        this.games = new ArrayList<>();
        this.isAvailable = true;
    }

    public void registerGame(Game game) {

        this.games.add(game);
    }

    public void unRegisterGame(String name) {

        for (Game game: this.games) {
            if(game.getName().equals(name)) {

                this.games.remove(game);
            }
        }
    }
}
