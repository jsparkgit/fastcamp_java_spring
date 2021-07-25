package ch02;

public class TakeTaxiTest {

    public static void main(String[] args) {

        Student edward  = new Student("Edward", 20000);
        Taxi taxi = new Taxi("102");

        edward.takeTaxi(taxi);

        edward.showTaxiInfo();
        taxi.showInfo();

    }


}
