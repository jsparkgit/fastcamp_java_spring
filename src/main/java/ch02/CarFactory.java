package ch02;

public class CarFactory {

    private static  CarFactory instacne = new CarFactory();

    private CarFactory() {}

    public static CarFactory getInstance() {

        if (instacne == null) {
            instacne =  new CarFactory();
        }
        return instacne;
    }

    public Car createCar() {
        Car car = new Car();
        return car;
    }
}
