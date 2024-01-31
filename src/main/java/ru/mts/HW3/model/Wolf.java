package ru.mts.HW3.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Wolf extends Predator{
    /**
     * Конструктор для создания волка с заданным породой и именем
     * использует значения по умолчанию для стоимости и характера
     * @param breed порода волка
     * @param name имя волка
     */
    public Wolf(String breed, String name) {
        this(breed, name, new BigDecimal("4152.14435"), "Angry");
    }
    public Wolf(String breed, String name, BigDecimal cost, String character) {
        this.breed = breed;
        this.name = name;
        this.cost = cost.setScale(2, RoundingMode.HALF_UP);
        this.character = character;
    }
}
