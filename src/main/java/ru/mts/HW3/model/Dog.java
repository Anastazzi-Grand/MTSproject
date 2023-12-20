package ru.mts.HW3.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Dog extends Pet{
    /**
     * Конструктор для создания собаки с заданным породой и именем
     * Использует значения по умолчанию для стоимости и характера
     * @param breed порода собаки
     * @param name имя собаки
     */
    public Dog(String breed, String name) {
        this(breed, name, new BigDecimal("2415.14435"), "Cute");
    }
    public Dog(String breed, String name, BigDecimal cost, String character) {
        this.breed = breed;
        this.name = name;
        this.cost = cost.setScale(2, RoundingMode.HALF_UP);
        this.character = character;
    }
}
