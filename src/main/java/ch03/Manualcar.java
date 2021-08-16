package ch03;

public class Manualcar extends Car {

    @Override
    public void drive() {
        System.out.println("Man drive");
    }

    @Override
    public void stop() {
        System.out.println("Man stop");

    }
}
