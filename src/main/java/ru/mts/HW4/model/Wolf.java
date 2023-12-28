package ru.mts.HW4.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Month;

public class Wolf extends Predator {
    /**
     * Конструктор для создания волка с заданным породой, именем и ДР
     * Использует значения по умолчанию для стоимости и характера
     * @param breed порода волка
     * @param name имя волка
     * @param birthDate ДР
     */
    public Wolf(String breed, String name, LocalDate birthDate) {
        this.breed = breed;
        this.name = name;
        this.cost = new BigDecimal("4152.14435").setScale(2, RoundingMode.HALF_UP);
        this.character = "Angry";
        this.birthDate = birthDate;
    }
}
