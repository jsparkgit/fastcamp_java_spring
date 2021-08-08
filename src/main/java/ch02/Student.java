package ch02;

import java.util.ArrayList;

public class Student {

    int studentNumber;
    String studentName;
    int majorCode;
    String majorName;
    int grade;
    String address;
    int studentID;
    int money;

//    Subject korea;
//    Subject math;

    ArrayList<Subject> subjectList;

    public Student() {

    }

    public Student(int studentID, String studentName, int grade) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.grade = grade;
    }

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
//        korea = new Subject();
//        math = new Subject();

        subjectList = new ArrayList<Subject>();

    }

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }


    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.take(1200);
        this.money -= 1200;
    }

    public void takeTaxi(Taxi taxi) {
        taxi.take(10000);
        this.money -= 10000;
    }

    public void addSubject(String name, int score) {

        Subject subject = new Subject();
        subject.setSubjectName(name);
        subject.setScore(score);
        subjectList.add(subject);

    }

//    public void showStudentInfo() {
//        System.out.println(studentName + "," + address);
//    }

    public String showStudentInfo() {
        return studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + " 학년 입니다.";
    }

    public void showStudentSubjectInfo() {
        int total = 0;

        for (Subject s : subjectList) {
            total += s.getScore();
            System.out.println("학생 " + studentName + "의 " + s.getSubjectName() + "  과목 성적은 " + s.getScore() + "입니다. ");

        }

        System.out.println("학생 " + studentName + "의 총점은 "  + total + "입니다.");
    }

    public String getStudentName() {
        return studentName;
    }

    public void showInfo() {
        System.out.println(studentName + "의 남은 돈은" + money + "원 입니다.");
    }

    public void showTaxiInfo() {
        System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
    }


}
