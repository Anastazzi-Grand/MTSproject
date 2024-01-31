package ru.mts.HW3.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Shark extends Predator{
    /**
     * Конструктор для создания акулы с заданным породой и именем
     * использует значения по умолчанию для стоимости и характера
     * @param breed порода акулы
     * @param name имя акулы
     */
    public Shark(String breed, String name) {
        this(breed, name, new BigDecimal("5123.14435"), "Angry");
    }
    public Shark(String breed, String name, BigDecimal cost, String character) {
        this.breed = breed;
        this.name = name;
        this.cost = cost.setScale(2, RoundingMode.HALF_UP);
        this.character = character;
    }
}
