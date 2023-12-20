package ru.mts.HW3.service;

public class CreateAnimalServiceImpl implements CreateAnimalService {
    /**
     * Создает 10 уникальных животных с помощью do-while.
     */
    public void createTenUniqueAnimals(){
        int i = 0;
        do {
            createAnimal();
            i++;
        } while (i < 10);
    }

    /**
     * Метод для создания N животных
     * @param n количество животных, которые необходимо создать
     */
    public void createTenUniqueAnimals(int n){
        for (int i = 0; i < n; i++){
            createAnimal();
        }
    }
}
