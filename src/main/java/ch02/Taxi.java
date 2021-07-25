package ch02;

public class Taxi {

    public String taxiName;
    public int money;

    public void take(int money) {
        this.money += money;
    }

    public Taxi(String taxiName) {
        this.taxiName  = taxiName;
    }

    public void showInfo() {

        System.out.printf( taxiName + "회사의 남은 돈은 " + money + "입니다.");

    }
}
