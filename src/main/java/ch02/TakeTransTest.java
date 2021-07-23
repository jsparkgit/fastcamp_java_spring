package ch02;

public class TakeTransTest {

    public static void main(String[] args) {

        Student studentJ = new Student("James", 5000);
        Student studentT = new Student("Thomas", 10000);

        Bus bus100 = new Bus(100);
        Subway subwayGreen = new Subway(2);

        studentJ.takeBus(bus100);
        studentT.takeSubway(subwayGreen);

        bus100.showBusInfo();
        subwayGreen.showSubwayInfo();

        studentJ.showInfo();
        studentT.showInfo();

    }



}
