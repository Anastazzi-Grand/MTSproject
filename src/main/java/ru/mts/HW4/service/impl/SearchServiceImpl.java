package ru.mts.HW4.service.impl;

import ru.mts.HW4.model.AbstractAnimal;
import ru.mts.HW4.service.SearchService;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchServiceImpl implements SearchService {

    /**
     * Переопределенный метод, находит животных, родившихся в високосный год
     * Данные хранятся в List, перебор элементов осуществляется с помощью цикла foreach
     *
     * @param animals Массив животных
     * @return Массив из имен животных
     */
    @Override
    public String[] findLeapYearNames(AbstractAnimal[] animals) {
        List<String> leapYearNames = new ArrayList<>();
        for (AbstractAnimal animal : animals) {
            if (animal.getBirthDate().isLeapYear()) {
                leapYearNames.add(animal.getName());
            }
        }
        return leapYearNames.toArray(new String[0]);
    }

    /**
     * Переопределенный метод, находит животных, которые старше заданного года
     * Данные хранятся в List, перебор элементов осуществляется с помощью цикла foreach
     *
     * @param animals Массив животных
     * @param N Заданный год
     * */
    @Override
    public AbstractAnimal[] findOlderAnimal(AbstractAnimal[] animals, int N) {
        ArrayList<AbstractAnimal> olderAnimalList = new ArrayList<>();
        for (AbstractAnimal animal : animals) {
            if (ChronoUnit.YEARS.between(animal.getBirthDate(), LocalDate.now()) > N) {
                olderAnimalList.add(animal);
            }
        }
        AbstractAnimal[] olderAnimalArray = new AbstractAnimal[olderAnimalList.size()];
        olderAnimalList.toArray(olderAnimalArray);
        return olderAnimalArray;
    }

    /**
     * Переопределенный метод, находит дубликаты животных
     * Данные хранятся в Map, перебор элементов осуществляется с помощью цикла foreach
     *
     * @param animals Массив животных
     * */
    @Override
    public void findDuplicate(AbstractAnimal[] animals) {
        Map<String, Integer> countMap = new HashMap<>();
        for (AbstractAnimal animal : animals) {
            String animalSignature = animal.toString();
            countMap.put(animalSignature, countMap.getOrDefault(animalSignature, 0) + 1);
        }

        int totalDuplicates = 0;
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Дубликат животного: " + entry.getKey() + " - Количество: " + entry.getValue());
                totalDuplicates += entry.getValue();
            }
        }

        if (totalDuplicates == 0) {
            System.out.println("Дубликаты не найдены.");
        } else {
            System.out.println("Общее количество дубликатов: " + totalDuplicates);
        }
    }
}
