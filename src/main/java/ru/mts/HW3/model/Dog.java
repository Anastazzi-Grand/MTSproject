package ru.mts.HW3.model;

import java.math.BigDecimal;

public class Dog extends Pet{
    public Dog(String breed, String name, BigDecimal cost, String character) {
        super(breed, name, cost, character);
    }
    public Dog(String breed, String name) {
        super(breed, name, new BigDecimal("2014.120435"), "Cute");
    }
}
