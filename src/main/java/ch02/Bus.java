package ch02;

public class Bus {

    int busNumber;
    int passengerCnt;
    int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money) {
        this.money = money;
        passengerCnt ++;
    }

    public void showBusInfo() {
        System.out.println(busNumber + "번 버스의 승객은 "  + passengerCnt + "명이고, 수입은 " + money + "원 입니다.");
    }

}
