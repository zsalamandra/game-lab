package service;

import java.time.LocalDateTime;

public class RentalSession {

    public static final int SESSION_DURATION = 40;

    private Integer id;
    private Client client;
    private Computer computer;
    private LocalDateTime startSession;
    private LocalDateTime endSession;

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
        client.withdrawal(500.0);

    }
}
