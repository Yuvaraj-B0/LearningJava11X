package Java_tasks.April_19_task;

class Animal2 {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog1 extends Animal2 {
    @Override
    void sound() {
        System.out.println("The dog barks");
    }
}

public class TestPolymorphism {
    public static void main(String[] args) {
        Animal2 myAnimal = new Animal2();
        Animal2 myDog = new Dog1();

        myAnimal.sound(); // Calls Animal's sound
        myDog.sound();    // Calls Dog's sound
    }
}

