package ch03;

public class AiCar extends Car {

    @Override
    public void drive() {
        System.out.println("AICar drive");
    }

    @Override
    public void stop() {
        System.out.println("AICar stop");
    }

}
