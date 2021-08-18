package ch03;

public class Customers implements  Buy, Sell {


    @Override
    public void buy() {
        System.out.println("customers buy");
    }

    @Override
    public void sell() {
        System.out.println("Customers Sell");
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public void order() {
        System.out.println("Customer order");
    }
}
