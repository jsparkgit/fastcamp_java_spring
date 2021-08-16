package ch03;

public abstract class Car {

    public abstract void drive();

    public abstract void stop() ;

    public void startCar() {
        System.out.println("Start Car");
    }

    public void turnoff() {
        System.out.println("Turn off car");
    }

    final void run() {
        startCar();
        drive();
        stop();
        turnoff();
    }
}
