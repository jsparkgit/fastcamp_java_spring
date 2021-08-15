package ch03;

import java.util.ArrayList;

class Animal {

    public void move() {
        System.out.println("moving");

    }

    public void eating() {

    }
}

class Human extends Animal {

    public void move() {
        System.out.println("human is moving");
    }

    public void readBooks() {
        System.out.println("human is reading");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("Tiger is moving");

    }
    public void hunting() {
        System.out.println("Tiger is hunting");
    }

}

class Eagle extends Animal {
    public void move() {
        System.out.println("Eagle is moving");
    }

    public void flying() {
        System.out.println("Eagle is flying");
    }
}

public class AnimalTest {

    public static void main(String[] args) {

        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

/*
        AnimalTest test = new AnimalTest();
        test.moveAnimal(hAnimal);
        test.moveAnimal(tAnimal);
        test.moveAnimal(eAnimal);
*/

//        System.out.println("================");

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

/*
        for (Animal animal : animalList) {
            animal.move();
        }
*/
        AnimalTest test = new AnimalTest();
        test.testDownCasting(animalList);

    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }

    public void testDownCasting(ArrayList<Animal> list) {

        for (int i = 0; i < list.size(); i++) {
            Animal animal = list.get(i);

            if (animal instanceof Human) {
                Human human = (Human) animal;
                human.readBooks();
            } else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            } else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.flying();
            } else {
                System.out.println("Error");
            }

        }

    }


}