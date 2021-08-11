package ch03;

public class GoldCustomer extends Customer {

    double saleRatio;

    public GoldCustomer(int custmerID, String customerName) {
        super(custmerID, customerName);

        customerGrade = "Gold";
        bonusRatio = 0.02;
        saleRatio = 0.1;
    }

    public int calcPrice(int price) {
        bounusPoint += price * bonusRatio;
        return price = (int) (price * saleRatio);
    }
}
