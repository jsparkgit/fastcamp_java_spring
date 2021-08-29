package ch03;

public class BeginnerLevel extends PlayerLevel {

    @Override
    void run() {
        System.out.println("Begineer Run");
    }

    @Override
    void jump() {
        System.out.println("Beginner Jump");

    }

    @Override
    void turn() {
        System.out.println("Beginnner turn");
    }

    @Override
    void showLevelMessage() {
        System.out.println("I'm Beginner");
    }
}
