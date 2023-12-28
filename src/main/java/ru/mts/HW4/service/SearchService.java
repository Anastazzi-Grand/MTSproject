package ru.mts.HW4.service;

import ru.mts.HW4.model.AbstractAnimal;

/**
 * Интерфейс для поиска по массиву с заданными условиями
 * */
public interface SearchService {
    /**
     * Нахождение животных, родившихся в високосный год
     *
     * @param animals Массив животных
     * @return Массив из имен животных
     */
    String[] findLeapYearNames(AbstractAnimal[] animals);

    /**
     * Вывод животных, старше N лет
     *
     * @param animals Массив животных
     * @param N       Значение возраста для поиска
     * @return Массив подходящих животных
     */
    AbstractAnimal[] findOlderAnimal(AbstractAnimal[] animals, int N);

    /**
     * Вывод дубликатов животных
     *
     * @param animals Массив животных
     */
    void findDuplicate(AbstractAnimal[] animals);
}
