package ch02;

public class Order {

    int orderId;
    int oderPhoneNumber;
    String orderAddr;
    String buyerId;
    String sellerId;
    int productId;
    String orderDate;
    String orderTime;
    int orderPrice;
    int menuId;

    int add(int num1, int num2) {

        int result;
        result = num1 + num2;
        return result;
    }

    public void showOrderInfo() {
        System.out.println("주문접수 번호 " + orderId );
    }
}
