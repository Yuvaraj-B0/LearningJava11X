package Java_tasks.OOPs_Polymorphism;

public class Lab_task_Method_Overriding {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.sound();
        d.Dog_name();

        Cat c = new Cat();
        c.sound();
    }
}
class Animal{
    void sound(){
        System.out.println("Animal Sound");
    }
    void Dog_name()
    {
        System.out.println("Dog name is dog");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }

}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat Meows");
    }
}
