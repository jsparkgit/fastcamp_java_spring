package ch02;

public class StudentTest2 {

    public static void main(String[] args) {

        Student studentLee = new Student(1001, "Lee");

        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 50);

        Student studentKim = new Student(1002, "Kim");

        studentKim.addSubject("국어", 70);
        studentKim.addSubject("수학", 80);
        studentKim.addSubject("영어", 100);

        studentLee.showStudentSubjectInfo();
        System.out.println("======================");
        studentKim.showStudentSubjectInfo();
    }
}
