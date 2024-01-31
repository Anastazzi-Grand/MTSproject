package ru.mts.HW5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;
import ru.mts.HW5.model.*;
import ru.mts.HW5.service.SearchService;
import ru.mts.HW5.service.impl.SearchServiceImpl;

import java.time.LocalDate;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;


public class MainTest {
    @Nested
    class EqualsTest {
        private final Cat cat1 = new Cat("Homeless", "Kitty", LocalDate.of(2005, 1, 1));
        private final Cat cat2 = new Cat("Homeless", "Kitty", LocalDate.of(2005, 1, 1));
        private final Cat cat3 = new Cat("Homeless", "Kitty", LocalDate.of(2005, 1, 1));
        private final Dog dog1 = new Dog("Mutt", "Bob", LocalDate.of(2008, 4, 20));

        @Test
        @DisplayName("Проверка корректности переопределения метода equals")
        public void equalsTestOverride() throws NoSuchMethodException {
            assertEquals(AbstractAnimal.class, AbstractAnimal.class.getMethod("equals", Object.class).getDeclaringClass());
        }

        @Test
        @DisplayName("Проверка рефлексивности метода equals")
        void testReflexive() {
            assertEquals(cat1, cat1);
        }

        @Test
        @DisplayName("Проверка симметричности метода equals")
        void testSymmetric() {
            assertEquals(cat1, cat2);
            assertEquals(cat2, cat1);
        }

        @Test
        @DisplayName("Проверка транзитивности метода equals")
        void testTransitive() {
            assertEquals(cat1, cat2);
            assertEquals(cat2, cat3);
            assertEquals(cat1, cat3);
        }

        @Test
        @DisplayName("Проверка консистентности метода equals")
        void testConsistent() {
            assertEquals(dog1, dog1);
            assertEquals(dog1, dog1);
        }

        @Test
        @DisplayName("Проверка непустого объекта метода equals")
        void testNullComparison() {
            assertNotEquals(null, cat1);
        }
    }

    @Nested
    class SearchServiceTest {
        private SearchService searchService = new SearchServiceImpl();
        @Test
        @DisplayName("Проверка метода findLeapYearNames")
        void testFindLeapYearNames() {
            // Создание объектов животных для теста
            AbstractAnimal[] animals = {new Wolf("Wolf", "W", LocalDate.of(2012, 2, 2)),
                    new Dog("Dog", "D",LocalDate.of(2010, 5, 10)),
                    new Cat("Cat", "C",LocalDate.of(2024, 1, 1))};


            // Ожидаемый результат
            String[] expected = {"W", "C"};

            // Проверка результата метода findLeapYearNames
            assertArrayEquals(expected, searchService.findLeapYearNames(animals));
        }

        @ParameterizedTest
        @ValueSource(ints = {3, 5, 10})
        @DisplayName("Проверка метода findOlderAnimal")
        void testFindOlderAnimal(int N) {
            AbstractAnimal[] animals = {new Wolf("Wolf", "W", LocalDate.of(2012, 2, 2)),
                    new Dog("Dog", "D",LocalDate.of(2010, 5, 10)),
                    new Cat("Cat", "C",LocalDate.of(2024, 1, 1))};

            AbstractAnimal[] result = searchService.findOlderAnimal(animals, N);

            for (AbstractAnimal animal : result) {
                assertTrue(Period.between(animal.getBirthDate(), LocalDate.now()).getYears() > N);
            }
        }

        @Test
        @DisplayName("Проверка метода findDuplicate")
        void testFindDuplicate() {
            AbstractAnimal[] animals = {
                    new Wolf("Wolf", "W", LocalDate.of(2012, 2, 2)),
                    new Dog("Dog", "D", LocalDate.of(2010, 5, 10)),
                    new Cat("Cat", "C", LocalDate.of(2024, 1, 1)),
                    new Dog("Dog", "D", LocalDate.of(2010, 5, 10))
            };

            Animal[] result = searchService.findDuplicate(animals);

            // Проверка возвращаемого значения
            assertEquals(1, result.length);
            assertEquals("Dog", result[0].getBreed());
            assertEquals("D", result[0].getName());
            assertEquals(LocalDate.of(2010, 5, 10), result[0].getBirthDate());
        }
    }
}
