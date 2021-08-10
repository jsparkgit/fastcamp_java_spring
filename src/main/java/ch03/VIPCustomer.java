package ch03;

public class VIPCustomer extends Customer {

    private int agentID;
    double salesRatio;

    public VIPCustomer(){
        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        salesRatio = 0.1;

//        System.out.println("VIPCustomer(int, String) 생성자 호출 ");

    }

    public int getAgentID() {
        return agentID;
    }

    @Override
    public int calcPrice(int price) {
        bounusPoint += price * bonusRatio;
        return price = (int)(price * salesRatio);
    }

}
