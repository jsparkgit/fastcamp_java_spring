package ch03;

public class BookShelfTest {
    public static void main(String[] args) {

        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("Title1");
        bookQueue.enQueue("title2");

        System.out.println(bookQueue.deQueue());
        System.out.println(bookQueue.deQueue());

    }
}
