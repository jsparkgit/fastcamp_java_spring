package ch01;

public class BreakTest {

    public static void main(String[] args) {
        int sum = 0;
        int num = 1;
        for ( ; ; num ++) {
            sum += num ;
            if ( sum > 100 ) break;
        }

        System.out.println("sum=" + sum);
        System.out.println("num=" + num);
    }
}
