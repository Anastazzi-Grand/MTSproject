package ru.mts.HW4;

import ru.mts.HW4.model.AbstractAnimal;
import ru.mts.HW4.model.Cat;
import ru.mts.HW4.model.Dog;
import ru.mts.HW4.service.impl.CreateAnimalServiceImpl;
import ru.mts.HW4.service.impl.SearchServiceImpl;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CreateAnimalServiceImpl createAnimalService = new CreateAnimalServiceImpl();
        System.out.println("\nСоздание 7 животных с помощью перегруженного метода:");
        AbstractAnimal[] animals = createAnimalService.createTenUniqueAnimals(7);


        AbstractAnimal cat1 = new Cat("White", "Kis", LocalDate.of(2012,5,13));
        AbstractAnimal cat2 = new Cat("White", "Kis", LocalDate.of(2012,5,13));
        AbstractAnimal cat3 = new Cat("White", "Kis", LocalDate.of(2012,5,13));
        AbstractAnimal dog1 = new Dog("Black", "Tim", LocalDate.of(2011,3,11));
        AbstractAnimal dog2 = new Dog("Black", "Tim", LocalDate.of(2011,3,11));

        AbstractAnimal[] animals2 = {cat1, dog1, cat2, dog2, cat3};


        SearchServiceImpl searchService = new SearchServiceImpl();

        System.out.println("Список имен животных, рожденных в високосный год:");
        String[] an = searchService.findLeapYearNames(animals);
        for (String s : an) System.out.print(s + " ");
        System.out.println();

        System.out.println("Года рождения животных, которые старше заданного возраста:");
        AbstractAnimal[] N = searchService.findOlderAnimal(animals, 10);
        for (AbstractAnimal s : N) System.out.println(s);

        System.out.println("Проверка на дубликаты у 1 массива:");
        searchService.findDuplicate(animals);
        System.out.println("Проверка на дубликаты у 2 массива:");
        searchService.findDuplicate(animals2);

//        Вывод
//        Создание 7 животных с помощью перегруженного метода:
//        Создано животное: Cooper - Labrador Birthday: 2010-11-29
//        Создано животное: Bella - Great White Birthday: 2000-05-06
//        Создано животное: Lucy - Labrador Birthday: 2015-03-20
//        Создано животное: Buddy - Arctic Birthday: 1997-09-15
//        Создано животное: Charlie - Great White Birthday: 1999-07-16
//        Создано животное: Cooper - Arctic Birthday: 2022-09-23
//        Создано животное: Max - Great White Birthday: 2005-05-16
//        Список имен животных, рожденных в високосный год:
//        Bella
//        Года рождения животных, которые старше заданного возраста:
//        Dog{breed='Labrador', name='Cooper', cost=1131.14, character='Cute', birthDate='2010-11-29}
//        Shark{breed='Great White', name='Bella', cost=7023.14, character='Angry', birthDate='2000-05-06}
//        Wolf{breed='Arctic', name='Buddy', cost=4152.14, character='Angry', birthDate='1997-09-15}
//        Shark{breed='Great White', name='Charlie', cost=7023.14, character='Angry', birthDate='1999-07-16}
//        Shark{breed='Great White', name='Max', cost=7023.14, character='Angry', birthDate='2005-05-16}
//        Проверка на дубликаты у 1 массива:
//        Дубликаты не найдены.
//        Проверка на дубликаты у 2 массива:
//        Дубликат животного: Cat{breed='White', name='Kis', cost=1234.14, character='Cute', birthDate='2012-05-13} - Количество: 3
//        Дубликат животного: Dog{breed='Black', name='Tim', cost=1131.14, character='Cute', birthDate='2011-03-11} - Количество: 2
//        Общее количество дубликатов: 5
    }
}
