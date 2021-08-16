package ch03;

public class CarTest {
    public static void main(String[] args) {

        Car aicar = new AiCar();
        aicar.run();

        System.out.println("===========");
        Car manCar = new Manualcar();
        manCar.run();

    }

}
