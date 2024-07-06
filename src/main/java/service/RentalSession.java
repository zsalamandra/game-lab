package service;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Random;

@Getter
public class RentalSession {

    public static final int SESSION_DURATION = 40;

    private Integer id;
    private Client client;
    private Computer computer;
    private LocalDateTime startSession;
    private LocalDateTime endSession;

    Random random = new Random();

    public RentalSession(Client client, Computer computer) {

        if (!client.getMembership().getIsActive()) {
            throw new RuntimeException("Client membership isn't active");
        }

        if (!computer.getIsAvailable()) {
            throw new RuntimeException("Computer is busy");
        }

        this.id = IdGenerator.incRentalSessionId();
        this.client = client;
        this.computer = computer;
        this.startSession = LocalDateTime.now();
        this.endSession = LocalDateTime.now().plusMinutes(SESSION_DURATION);

        computer.setIsAvailable(false);

        Game game = chooseGame(computer);
        int periodCount = choosePeriod();

        client.withdrawal(game.getPrice() * periodCount);

    }

    private Game chooseGame(Computer computer) {

        int id = random.nextInt(computer.getGameCount()) + 1;
        return computer.getGameByIndex(id);
    }

    private int choosePeriod() {

        return random.nextInt(2) + 1;
    }
}
