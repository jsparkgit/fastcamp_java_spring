package ch03;

public class MainBoadPlay {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(1);

        System.out.println();
        player.upgradeLevel(new AdvancedLevel());
        player.play(2);

    }
}
