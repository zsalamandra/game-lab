package service;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

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

    public void printClientInfo(Client client) {

        System.out.println(client);
    }

    public void printClientsInfo() {

        for (Client client : this.clients) {
            printClientInfo(client);
        }
    }
}
