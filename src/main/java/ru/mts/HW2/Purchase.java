package ru.mts.HW2;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Класс "Покупка" - хранит информацию о покупке товара
 * */

public class Purchase {
    private int countOfProducts; // количество купленного товара
    private BigDecimal sumOfProducts; // сумма товара
    private BigDecimal discount; // скидка на товар

    public Purchase(int countOfProducts, double sumOfProducts, double discount) {
        this.countOfProducts = countOfProducts;
        this.sumOfProducts = BigDecimal.valueOf(sumOfProducts);
        this.discount = BigDecimal.valueOf(discount);
    }
    public int getCountOfProducts() {
        return countOfProducts;
    }

    public void setCountOfProducts(int countOfProducts) {
        this.countOfProducts = countOfProducts;
    }

    public BigDecimal getSumOfProducts() {
        return sumOfProducts;
    }

    public void setSumOfProducts(double sumOfProducts) {
        this.sumOfProducts = BigDecimal.valueOf(sumOfProducts);
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = BigDecimal.valueOf(discount);
    }

    /**
     * метод для подсчета суммы покупки со скидкой и без
     * @param purchase объект покупки
     * */
    public static void calculateFinalCostOfPurchase(Purchase purchase) {
        BigDecimal amountWithoutDiscount = purchase.getSumOfProducts().multiply(BigDecimal.valueOf(purchase.getCountOfProducts()));
        BigDecimal discountMultiplier = BigDecimal.valueOf(1).subtract(purchase.getDiscount().divide(BigDecimal.valueOf(100)));
        BigDecimal amountWithDiscount = amountWithoutDiscount.multiply(discountMultiplier).setScale(2, RoundingMode.HALF_UP);

        System.out.println("Сумма за покупку без скидки: " + amountWithoutDiscount);
        System.out.println("Сумма за покупку со скидкой: " + amountWithDiscount);
    }
}
