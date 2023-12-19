package ru.mts.HW3.model;

import java.math.BigDecimal;

// Интерфейс Animal с методами для получения информации о животных
public interface Animal {
    /**
     * Возвращает породу животного
     *
     * @return порода животного
     */
    String getBreed();

    /**
     * Возвращает имя животного
     *
     * @return имя животного
     */
    String getName();

    /**
     * Возвращает цену животного
     *
     * @return цена животного
     */
    BigDecimal getCost();

    /**
     * Возвращает характер животного
     *
     * @return характер животного
     */
    String getCharacter();
}
