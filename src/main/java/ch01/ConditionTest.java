package ch01;

import java.nio.Buffer;
import java.util.Scanner;

public class ConditionTest {
    public static void main(String[] args) {

        int max;
        System.out.println("두개의 입력 수 중 큰 수를 프린트!!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력 :");
        int x = scanner.nextInt();

        System.out.println("입력 : ");
        int y = scanner.nextInt();

        max = (x > y) ? x : y;
        System.out.println(max);
    }
}
