package ch03;

public class Player {

    PlayerLevel level;

    public Player() {
        this.level = new BeginnerLevel() ;
        level.showLevelMessage();

    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int i) {
        level.go(i);
    }
}
