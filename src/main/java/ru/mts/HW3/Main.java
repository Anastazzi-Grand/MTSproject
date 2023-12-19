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
//        Создано животное: BobDog - Labradorcost: 2014.12
//        Создано животное: BobDog - Labradorcost: 2014.12
//        Создано животное: WowWolf - Arcticcost: 6534.17
//        Создано животное: FafShark - Great Whitecost: 5140.25
//        Создано животное: FafShark - Great Whitecost: 5140.25
//        Создано животное: BobDog - Labradorcost: 2014.12
//        Создано животное: KisaCat - Siberiancost: 1234.14
//        Создано животное: FafShark - Great Whitecost: 5140.25
//        Создано животное: FafShark - Great Whitecost: 5140.25
//        Создано животное: WowWolf - Arcticcost: 6534.17
//
//        Создание 5 животных с помощью перегруженного метода:
//        Создано животное: FafShark - Great Whitecost: 5140.25
//        Создано животное: BobDog - Labradorcost: 2014.12
//        Создано животное: BobDog - Labradorcost: 2014.12
//        Создано животное: WowWolf - Arcticcost: 6534.17
//        Создано животное: BobDog - Labradorcost: 2014.12
    }
}
