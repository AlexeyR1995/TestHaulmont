package ru.linarkou.loans.v1.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class CreditOffer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long clientId;
    private long creditId;
    private long sum;
    private long paymentSheduleId;
}
