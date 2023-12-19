package ru.mts.HW3.model;

import java.math.BigDecimal;

public class Cat extends Pet{
    public Cat(String breed, String name, BigDecimal cost, String character) {
        super(breed, name, cost, character);
    }

    public Cat(String breed, String name) {
        super(breed, name, new BigDecimal("1234.14435"), "Cute");
    }
}
