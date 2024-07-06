package service;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<RentalSession> rentalSessions = new ArrayList<>();

        Game game1 = new Game("Mortal Kombat", GameGenre.FIGHTING, 120.0);
        Game game2 = new Game("Gran Turizmo", GameGenre.ACTION, 180.0);

        Client client1 = new Client("Zaur");
        client1.addFunds(500.0);

        Client client2 = new Client("Artur");
        client2.addFunds(1450.0);

        Computer computer1 = new Computer();
        computer1.registerGame(game1);

        Computer computer2 = new Computer();
        computer2.registerGame(game1);
        computer2.registerGame(game2);

        Club club = new Club();
        club.addGame(game1);
        club.addGame(game2);

        club.registerClient(client1);
        club.registerClient(client2);

        club.printClientsInfo();

        RentalSessionService.addSession(client1, computer2);
        RentalSessionService.addSession(client2, computer1);

        club.printClientsInfo();
    }
}
