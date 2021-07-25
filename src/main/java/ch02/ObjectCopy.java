package ch02;

public class ObjectCopy {

    public static void main(String[] args) {

        Book[] library = new Book[5];
        Book[] copyLibrary = new Book[5];

        library[0] = new Book("t1", "kim");
        library[1] = new Book("t2", "kim");
        library[2] = new Book("t3", "kim");
        library[3] = new Book("t4", "kim");
        library[4] = new Book("t5", "kim");

        System.arraycopy(library, 0, copyLibrary, 0, 5);

        System.out.println("======== copy libray ===============");

        for (Book book : library) {
            book.showBookInfo();
        }

        library[0].setTitle("t1_t1");
        library[0].setAuthor("kim_kim");

        System.out.println("========= libaray ======");

        for (Book book : library) {
            book.showBookInfo();
        }

        System.out.println("======== copy library ========");

        for (Book book : copyLibrary) {

            book.showBookInfo();
        }
    }
}
