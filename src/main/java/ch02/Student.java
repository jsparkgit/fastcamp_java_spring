package ch02;

public class Student {

    int studentNumber;
    String studentName;
    int majorCode;
    String majorName;
    int grade;
    String address;
    int studentID;

    Subject korea;
    Subject math;

    public Student() {

    }

    public Student(int studentID, String studentName, int grade)    {
        this.studentID = studentID;
        this.studentName = studentName;
        this.grade = grade;
    }

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

        korea = new Subject();
        math = new Subject();

    }



//    public void showStudentInfo() {
//        System.out.println(studentName + "," + address);
//    }

    public String showStudentInfo(){
        return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + " 학년 입니다.";
    }

    public String getStudentName() {
        return studentName;
    }
}
