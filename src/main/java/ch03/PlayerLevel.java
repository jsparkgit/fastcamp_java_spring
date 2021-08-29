package ch03;

public abstract class PlayerLevel {

    abstract void run();
    abstract void jump();
    abstract void turn();
    abstract void showLevelMessage();

    void go(int cnt) {
        for (int i = 0; i < cnt; i++) {
            run();
            jump();
            turn();
        }
    }

}
