package ch02;

import java.util.ArrayList;

public class ArryListTest {

    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<Book>();

        library.add(new Book("t1", "kim"));
        library.add(new Book("t2", "kim"));
        library.add(new Book("t3", "kim"));
        library.add(new Book("t4", "kim"));

        for (int i = 0; i < library.size(); i++) {
            library.get(i).showBookInfo();
        }
    }
}
