package ru.mts.HW3.model;

import java.math.BigDecimal;

/**
 * Абстрактный класс для представления животных
 * */
public abstract class AbstractAnimal implements Animal {
    protected String breed; // порода
    protected String name; // имя
    protected BigDecimal cost; // цена в магазине
    protected String character; // характер

    public AbstractAnimal() {}

    @Override
    public String getBreed() {
        return this.breed;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public BigDecimal getCost() {
        return this.cost;
    }

    @Override
    public String getCharacter() {
        return this.character;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +"{" +
                "breed='" + getBreed() + '\'' +
                ", name='" + getName() + '\'' +
                ", cost=" + getCost() +
                ", character='" + getCharacter() + '\'' +
                '}';
    }
}
