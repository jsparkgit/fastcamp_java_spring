package ch02;

public class OrderTest {

    public static void main(String[] args) {
        Order myOrder = new Order();
        myOrder.orderId = 202101234;
        myOrder.oderPhoneNumber = 13023;
        myOrder.orderAddr = "seould kangagu";
        myOrder.orderDate = "20210101";
        myOrder.orderTime = "2012123";

        myOrder.showOrderInfo();

    }

}
