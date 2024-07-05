package service;

public class IdGenerator {

    private static int clientId = 0;
    private static int membershipId = 0;
    private static int gameId;
    private static int computerId;
    private static int rentalSessionId;

    public static int incMembershipId() {

        return ++membershipId;
    }

    public static int incClientId() {

        return ++clientId;
    }

    public static int incGameId() {

        return ++gameId;
    }

    public static int incComputerId() {

        return ++computerId;
    }

    public static int incRentalSessionId() {

        return ++rentalSessionId;
    }

}
