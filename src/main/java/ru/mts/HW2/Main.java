package ru.mts.HW2;

public class Main {
    public static void main(String[] args) {
        // Создание объектов покупок с различными параметрами
        Purchase purchase1 = new Purchase(5, 100.0, 0.75);
        Purchase.calculateFinalCostOfPurchase(purchase1);

        Purchase purchase2 = new Purchase(10, 200.0, 42.575);
        Purchase.calculateFinalCostOfPurchase(purchase2);

        Purchase purchase3 = new Purchase(3, 50.0, 59.1);
        Purchase.calculateFinalCostOfPurchase(purchase3);

//        Вывод в консоли
//        Сумма за покупку без скидки: 500.0
//        Сумма за покупку со скидкой: 496,25
//        Сумма за покупку без скидки: 2000.0
//        Сумма за покупку со скидкой: 1148,50
//        Сумма за покупку без скидки: 150.0
//        Сумма за покупку со скидкой: 61,35
    }
}
