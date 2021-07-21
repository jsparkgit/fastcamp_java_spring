package ch02;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Tomas";
        person.age = 37;
        person.gender = "femail";

        person.showPersonInfo();
    }
}
