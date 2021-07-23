package ch02;

public class Person {

    public String name;
    public int age;
    public int height;
    public int weight;
    public String gender;

    public Person() {
        this("unknwon", 10);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person getPerson() {
        return this;
    }

    public void showPersonInfo() {
        System.out.println("이름은 " + name + "이고, 나이는 " + age + "세 입니다.");
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.name = "kim";
        p.age = 5;

        Person p2 = p.getPerson();

        System.out.println("p:" + p);
        System.out.println("p2:" + p2);

    }

}
