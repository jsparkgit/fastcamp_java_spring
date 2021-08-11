package ch03;

import java.util.ArrayList;

public class CustomerTest3 {

    public static void main(String[] args) {

        Customer customerLee = new Customer(10010, "Lee");
        Customer customerShin = new GoldCustomer(10020, "shin");
        Customer customerKim = new VIPCustomer(10030, "Kim", 12345);


        ArrayList<Customer> customerList = new ArrayList<Customer>();
        customerList.add(customerLee);
        customerList.add(customerShin);
        customerList.add(customerKim);

        System.out.printf("==== 고객 정보 출력 ======");
        for (Customer customer : customerList) {
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("==== 할인율과 보너스 포인트 계산 =====");

        int price = 10000;
        for (Customer customer : customerList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + "님이 " + cost + "원 지불했습니다.");
            System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bounusPoint);
        }

    }
}
