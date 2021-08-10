package ch03;

public class Customer {

    protected int customerID;
    protected String customerName;
    protected String customerGrade;
    int bounusPoint;
    double bonusRatio;

    public Customer() {
        customerGrade = "Silver";
        bonusRatio = 0.01;
    }

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "Silver";
        bonusRatio = 0.01;
//        System.out.println("customer(int, String) 생성자 호출");

    }

    public int calcPrice(int price) {
        bounusPoint += price * bonusRatio;
        return price;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public int getBounusPoint() {
        return bounusPoint;
    }

    public void setBounusPoint(int bounusPoint) {
        this.bounusPoint = bounusPoint;
    }

    public double getBonusRatio() {
        return bonusRatio;
    }

    public void setBonusRatio(double bonusRatio) {
        this.bonusRatio = bonusRatio;
    }

    public String showCustomerInfo() {
        return customerName + "님의 등급은 " + customerGrade + " 이며, 보너스 포인트는 " + bounusPoint + "입니다.";
    }
}
