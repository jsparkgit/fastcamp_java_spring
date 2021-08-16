package ch03;

public abstract class Computer {

    abstract void display();
    abstract void typing();

    public void turnon() {
        System.out.println("전원을 켭니다.");
    }

    public void turnoff() {
        System.out.println("전원을 끕니다.");
    }

}


