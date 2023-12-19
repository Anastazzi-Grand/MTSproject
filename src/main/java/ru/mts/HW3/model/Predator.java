package ru.mts.HW3.model;

import java.math.BigDecimal;

// Абстрактный класс для хищников
public abstract class Predator extends AbstractAnimal{
    public Predator(String breed, String name, BigDecimal cost, String character) {
        super(breed, name, cost, character);
    }
}
