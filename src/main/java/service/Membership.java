package service;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class Membership {

    private Integer id;
    private SubscriptionType subscriptionType;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private Integer maxRentHours;
    private Double balance;
    private Integer remainingHours;
    private Boolean isActive;
}
