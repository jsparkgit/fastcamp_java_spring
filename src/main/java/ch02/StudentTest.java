package ch02;

public class StudentTest {
    public static void main(String[] args) {

//    Student studentLee = new Student();

        Student studentlee = new Student(12345, "Lee", 3 );

        String data = studentlee.showStudentInfo();

        System.out.println(data);
    }
}
