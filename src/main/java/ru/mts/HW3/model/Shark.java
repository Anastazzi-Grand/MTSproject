package ru.mts.HW3.model;

import java.math.BigDecimal;

public class Shark extends Predator{
    public Shark(String breed, String name, BigDecimal cost, String character) {
        super(breed, name, cost, character);
    }

    public Shark(String breed, String name) {
        super(breed, name, new BigDecimal("5140.25035"), "Angry");
    }
}
