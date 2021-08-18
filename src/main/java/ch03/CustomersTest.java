package ch03;

public class CustomersTest {
    public static void main(String[] args) {

        Customers customers = new Customers();
        customers.buy();
        customers.sell();
        customers.sayHello();

        Buy buyer = customers;
        buyer.buy();

        Sell seller = customers;
        seller.sell();

        buyer.order();
        seller.order();
    }
}
