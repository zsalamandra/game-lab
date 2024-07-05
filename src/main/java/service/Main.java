package service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CyclicBarrier;

public class Main {

    public static void main(String[] args) {

        List<RentalSession> rentalSessions = new ArrayList<>();

        Game game1 = new Game("Mortal Kombat", GameGenre.FIGHTING);
        Game game2 = new Game("Gran Turizmo", GameGenre.ACTION);

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

        RentalSession rentalSession1 = new RentalSession(client1, computer2);
        RentalSession rentalSession2= new RentalSession(client1, computer1);

        rentalSessions.add(rentalSession1);
        rentalSessions.add(rentalSession2);


    }
}
