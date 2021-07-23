package ch02;

public class Subway {

    int lineNumber;
    int passengerCnt;
    int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take(int money) {
        this.money = money;
        this.passengerCnt ++;
    }

    public void showSubwayInfo() {
        System.out.println(lineNumber + "번 지하철의 승객은 " + passengerCnt + "명이고, 수입은 " + money + " 입니다.");
    }
}


