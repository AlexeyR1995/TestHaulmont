package ru.linarkou.loans.v1.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Credit {

        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private long id;
        private long limit;
        private double procentRate;
        private long bankId;
        private long creditOfferId;
}

