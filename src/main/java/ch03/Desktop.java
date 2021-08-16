package ch03;

public class Desktop extends Computer {

    @Override
    void display() {
        System.out.println("Desktop Display");
    }

    @Override
    void typing() {
        System.out.println("Desktop typing");
    }

    @Override
    public void turnon() {
        System.out.println("Desktop turnon");
    }

    @Override
    public void turnoff() {
        System.out.println("Desktop turnoff");
    }
}
