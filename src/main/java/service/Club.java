package service;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Club {

    private List<Client> clients;
    private List<Game> games;

    public Club() {

        this.clients = new ArrayList<>();
        this.games = new ArrayList<>();
    }

    public void registerClient(Client client) {

        this.clients.add(client);
    }

    public void addGame(Game game) {

        this.games.add(game);
    }
}
