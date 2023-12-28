package ru.mts.HW4.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Month;

public class Shark extends Predator {
    /**
     * Конструктор для создания акулы с заданным породой, именем и ДР
     * Использует значения по умолчанию для стоимости и характера
     * @param breed порода акулы
     * @param name имя акулы
     * @param birthDate ДР
     */
    public Shark(String breed, String name, LocalDate birthDate) {
        this.breed = breed;
        this.name = name;
        this.cost = new BigDecimal("7023.14435").setScale(2, RoundingMode.HALF_UP);
        this.character = "Angry";
        this.birthDate = birthDate;
    }
}
