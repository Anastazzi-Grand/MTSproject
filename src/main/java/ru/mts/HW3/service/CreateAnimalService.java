package ru.mts.HW3.service;

import ru.mts.HW3.model.*;
import java.util.Random;

/**
 * Интерфейс для создания новых животных и метод для создания 10 уникальных животных
 * */
public interface CreateAnimalService {
    int MAX_COUNT_TYPE_ANIMAL = 4;

    /**
     * Создает 10 уникальных животных с помощью while.
     */
    default void createTenUniqueAnimals() {
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
        AbstractAnimal animal = null;
        Random random = new Random();
        int randomNumber = random.nextInt(MAX_COUNT_TYPE_ANIMAL);
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
        }
        System.out.println("Создано животное: " + animal.getName() + " - " + animal.getBreed() + " cost: " + animal.getCost());
    }
}
