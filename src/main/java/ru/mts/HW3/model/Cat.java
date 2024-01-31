package ru.mts.HW3.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cat extends Pet{
    /**
     * Конструктор для создания кошки с заданным породой и именем
     * использует значения по умолчанию для стоимости и характера
     * @param breed порода кошки
     * @param name имя кошки
     */
    public Cat(String breed, String name) {
        this(breed, name, new BigDecimal("1234.14435"), "Cute");
    }
    public Cat(String breed, String name, BigDecimal cost, String character) {
        this.breed = breed;
        this.name = name;
        this.cost = cost.setScale(2, RoundingMode.HALF_UP);
        this.character = character;
    }
}
