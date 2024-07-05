package service;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Client {

    private Integer id;
    private String name;
    private Membership membership;

    public Client(String name) {

        this.id = IdGenerator.incClientId();
        this.name = name;

        this.membership = Membership.builder()
                .id(IdGenerator.incMembershipId())
                .subscriptionType(SubscriptionType.BASIC)
                .startDateTime(LocalDateTime.now())
                .maxRentHours(0)
                .balance(0.0)
                .isActive(false)
                .build();
    }

    public void addFunds(Double founds) {

        membership.setBalance(membership.getBalance() + founds);
        membership.setIsActive(true);

    }

    public void withdrawal(Double money) {

        if (money <= membership.getBalance()) {
            membership.setBalance(membership.getBalance() - money);
        } else {
            throw new RuntimeException("Balance of client less then cost of game");
        }
    }

    @Override
    public String toString() {

        return String.format("Client: \nid: %d\nname: %s\nbalance: %.2f", id, name, membership.getBalance());
    }
}
