package ch02;

public class CharArrayTest {

    public static void main(String[] args) {

        char[] alpahbets = new char[26];
        char ch = 'A';

        for (int i = 0; i< alpahbets.length; i++) {

            alpahbets[i] = ch++;

        }

        for (char alpah : alpahbets) {
            System.out.println(alpah+ ", " + (int)alpah);
        }
    }
}
