package ru.mts.HW3;

import ru.mts.HW3.service.CreateAnimalServiceImpl;

public class Main {
    public static void main(String[] args) {
        CreateAnimalServiceImpl createAnimalService = new CreateAnimalServiceImpl();
        System.out.println("Создание 10 животных по умолчанию:");
        createAnimalService.createTenUniqueAnimals();
        System.out.println("\nСоздание 5 животных с помощью перегруженного метода:");
        createAnimalService.createTenUniqueAnimals(5);

//        Вывод
//        Создание 10 животных по умолчанию:
//        Создано животное: KisaCat - Siberian cost: 1234.14
//        Создано животное: WowWolf - Arctic cost: 4152.14
//        Создано животное: BobDog - Labrador cost: 2415.14
//        Создано животное: FafShark - Great White cost: 5123.14
//        Создано животное: FafShark - Great White cost: 5123.14
//        Создано животное: FafShark - Great White cost: 5123.14
//        Создано животное: BobDog - Labrador cost: 2415.14
//        Создано животное: WowWolf - Arctic cost: 4152.14
//        Создано животное: FafShark - Great White cost: 5123.14
//        Создано животное: FafShark - Great White cost: 5123.14
//
//        Создание 5 животных с помощью перегруженного метода:
//        Создано животное: FafShark - Great White cost: 5123.14
//        Создано животное: FafShark - Great White cost: 5123.14
//        Создано животное: FafShark - Great White cost: 5123.14
//        Создано животное: KisaCat - Siberian cost: 1234.14
//        Создано животное: WowWolf - Arctic cost: 4152.14
    }
}
