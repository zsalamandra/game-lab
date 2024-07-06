package service;

import java.util.ArrayList;
import java.util.List;

public final class RentalSessionService {

    private static final List<RentalSession> sessions = new ArrayList<>();

    public static void addSession(Client client, Computer computer) {

        if (isClientInSession(client)) {
            throw new RuntimeException("Client is busy");
        }

        RentalSession rentalSession = new RentalSession(client, computer);
        sessions.add(rentalSession);
    }

    private static boolean isClientInSession(Client client) {

        for (RentalSession session: sessions) {

            if (session.getClient().equals(client)) {
                return true;
            }
        }

        return false;
    }
}
