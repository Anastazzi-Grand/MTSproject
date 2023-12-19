package ru.mts.HW3.service;

import ru.mts.HW3.model.*;

import java.math.BigDecimal;
import java.util.Random;

// Интерфейс для создания новых животных и метод для создания 10 уникальных животных
public interface CreateAnimalService {
    /**
     * Создает 10 уникальных животных с помощью while.
     */
    default void create10UniqueAnimals() {
        int count = 0;
        while (count < 10) {
            createAnimal();
            count++;
        }
    }

    /**
    * Создает уникальное животное.
    */
    default void createAnimal() {
        AbstractAnimal animal;
        Random random = new Random();
        BigDecimal cost = new BigDecimal(random.nextInt(1000) + 500);
        int randomNumber = random.nextInt(4);
        switch (randomNumber) {
            case 0:
                animal = new Cat("Siberian", "KisaCat");
                break;
            case 1:
                animal = new Dog("Labrador", "BobDog");
                break;
            case 2:
                animal = new Wolf("Arctic", "WowWolf");
                break;
            case 3:
                animal = new Shark("Great White", "FafShark");
                break;
            default:
                animal = new Cat("Siberian", "Kitty", cost, "Playful");
        }
        System.out.println("Создано животное: " + animal.getName() + " - " + animal.getBreed() + "cost: " + animal.getCost());
    }
}
