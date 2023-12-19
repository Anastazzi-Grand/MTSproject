package ru.mts.HW3.model;

import java.math.BigDecimal;

public class Wolf extends Predator{
    public Wolf(String breed, String name, BigDecimal cost, String character) {
        super(breed, name, cost, character);
    }

    public Wolf(String breed, String name) {
        super(breed, name, new BigDecimal("6534.17435"), "Angry");
    }
}
