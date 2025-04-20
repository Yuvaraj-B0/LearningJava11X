package Java_tasks.April_19_task;

abstract class Animal1 {
    abstract void sound();

    void sleep() {
        System.out.println("This animal sleeps.");
    }
}

class Cat extends Animal1 {
    void sound() {
        System.out.println("The cat meows.");
    }
}

public class TestAbstraction {
    public static void main(String[] args) {
        Animal1 myCat = new Cat();
        myCat.sound(); // Abstract method implemented in Cat
        myCat.sleep(); // Concrete method from Animal
    }
}

