package ch03;

public class CustomersTest {
    public static void main(String[] args) {

        Customers customers = new Customers();
        customers.buy();
        customers.sell();
        customers.sayHello();

        System.out.println();
        Buy buyer = customers;
        buyer.buy();

        Sell seller = customers;
        seller.sell();

        buyer.order();
        seller.order();

        System.out.println();
        ((Buy)buyer).order();
        ((Sell)seller).order();

    }
}
