package ch01;

public class SwitchCaseTest2 {

    public static void main(String[] args) {

        String medal1 = "Gold";

        switch(medal1) {
            case "Gold":
                System.out.println("gold medal!!");
                break;
            case "Sivler":
                System.out.println("silver medal!!");
                break;
            default:
                System.out.println("bronze medal!!");
                break;
        }


    }
}
