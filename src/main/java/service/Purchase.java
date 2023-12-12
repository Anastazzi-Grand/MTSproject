package service;

/**
 * Класс "Покупка" - хранит информацию о покупке товара
 * */
public class Purchase {
    private int countOfProducts; // количество купленного товара
    private double sumOfProducts; // сумма товара
    private double discount; // скидка на товар

    public Purchase(int countOfProducts, double sumOfProducts, double discount) {
        this.countOfProducts = countOfProducts;
        this.sumOfProducts = sumOfProducts;
        this.discount = discount;
    }
    public int getCountOfProducts() {
        return countOfProducts;
    }

    public void setCountOfProducts(int countOfProducts) {
        this.countOfProducts = countOfProducts;
    }

    public double getSumOfProducts() {
        return sumOfProducts;
    }

    public void setSumOfProducts(double sumOfProducts) {
        this.sumOfProducts = sumOfProducts;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * метод для подсчета суммы покупки со скидкой и без
     * @param purchase объект покупки
     * */
    public static void calculateFinalCostOfPurchase(Purchase purchase) {
        double amountWithoutDiscount = purchase.countOfProducts * purchase.sumOfProducts;
        double amountWithDiscount = amountWithoutDiscount - (amountWithoutDiscount * (purchase.discount / 100));

        System.out.println("Сумма за покупку без скидки: " + amountWithoutDiscount);
        System.out.printf("Сумма за покупку со скидкой: %.2f", amountWithDiscount);
        System.out.println();
    }
}
