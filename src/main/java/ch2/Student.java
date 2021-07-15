package ch2;

public class Student {

    int studentNumber;
    String studentName;
    int majorCode;
    String majorName;
    int grade;
    String address;

    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }

    public String getStudentName() {
        return studentName;
    }
}
