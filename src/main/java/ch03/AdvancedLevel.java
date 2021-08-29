package ch03;

public class AdvancedLevel extends PlayerLevel {

    @Override
    void run() {
        System.out.println("Advanced  Run");
    }

    @Override
    void jump() {
        System.out.println("Advanced Jump");

    }

    @Override
    void turn() {
        System.out.println("Advanced  turn");
    }

    @Override
    void showLevelMessage() {
        System.out.println("I'm Advanced ");
    }
 }
