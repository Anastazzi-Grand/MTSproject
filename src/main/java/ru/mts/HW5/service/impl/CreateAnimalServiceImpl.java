package ru.mts.HW5.service.impl;

import ru.mts.HW5.model.AbstractAnimal;
import ru.mts.HW5.service.CreateAnimalService;

public class CreateAnimalServiceImpl implements CreateAnimalService {
    /**
     * Создает 10 уникальных животных с помощью do-while.
     */
    public AbstractAnimal[] createTenUniqueAnimals(){
        AbstractAnimal[] animals = new AbstractAnimal[10];
        int i = 0;
        do {
            animals[i] = createAnimal();
            i++;
        } while (i < 10);
        return animals;
    }

    /**
     * Метод для создания N животных
     * @param n количество животных, которые необходимо создать
     */
    public AbstractAnimal[] createTenUniqueAnimals(int n){
        AbstractAnimal[] animals = new AbstractAnimal[n];
        for (int i = 0; i < n; i++){
            animals[i] = createAnimal();
        }
        return animals;
    }
}
