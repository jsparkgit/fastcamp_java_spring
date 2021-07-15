package ch2;

public class StudentTest {

    public static void main(String[] args) {

        Student studentLee = new Student();
        studentLee.studentName = "LeeSunShin";
        studentLee.address = "seoul";

        studentLee.showStudentInfo();

        Student studentKim = new Student();
        studentKim.studentName = "Kim";
        studentKim.address = "Busan";

        studentKim.showStudentInfo();

        System.out.println(studentKim);
        System.out.println(studentLee);

    }


}
