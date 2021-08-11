package ch03;

public class CustomerTest2 {

    public static void main(String[] args) {

        Customer customerLee = new Customer(10010, "이순신");
        customerLee.bounusPoint = 1000;
//        customerLee.setBounusPoint(1000);
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
        customerKim.bounusPoint = 10000;
//        customerKim.setBounusPoint(10000);
        System.out.println(customerKim.showCustomerInfo());

        System.out.println();

        int priceLee = customerLee.calcPrice(10000);
        int priceKim = customerKim.calcPrice(10000);

        System.out.println(customerLee.showCustomerInfo() + " 지불금액은 " + priceLee);
        System.out.println(customerKim.showCustomerInfo() + " 지불금액은 " + priceKim);

        System.out.println();
        Customer customerNo = new VIPCustomer(10030, "온달");
        customerNo.bounusPoint = 10000;
//        customerNo.setBounusPoint(10000);
        int priceNo = customerNo.calcPrice(10000);
        System.out.println(customerNo.showCustomerInfo() + " 지불금액은 "+ priceNo);
    }

}
