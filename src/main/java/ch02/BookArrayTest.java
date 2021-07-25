package ch02;

public class BookArrayTest {

    public static void main(String[] args) {

        Book[] library = new Book[5];

        library[0] = new Book("Text1", "kim");
        library[1] = new Book("Text2", "kim");
        library[2] = new Book("Text3", "kim");
        library[3] = new Book("Text4", "kim");
        library[4] = new Book("Text5", "kim");

        for (Book book : library) {
            System.out.println(book);
            book.showBookInfo();
        }

    }
}
