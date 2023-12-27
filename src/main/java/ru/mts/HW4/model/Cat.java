package ru.mts.HW4.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Month;

public class Cat extends Pet {
    /**
     * Конструктор для создания кошки с заданным породой, именем и ДР
     * Использует значения по умолчанию для стоимости и характера
     * @param breed порода кошки
     * @param name имя кошки
     * @param birthDate ДР
     */
    public Cat(String breed, String name, LocalDate birthDate) {
        this.breed = breed;
        this.name = name;
        this.cost = new BigDecimal("1234.14435").setScale(2, RoundingMode.HALF_UP);
        this.character = "Cute";
        this.birthDate = birthDate;
    }
}
