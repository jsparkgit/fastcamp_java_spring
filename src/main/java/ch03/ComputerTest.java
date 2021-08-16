package ch03;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new Desktop();

        computer.display();
        computer.turnoff();

        System.out.println("====================");
        NoteBook myNote = new MyNoteBook() ;

        myNote.typing();
        myNote.display();
        myNote.turnon();
        myNote.turnoff();

    }
}
