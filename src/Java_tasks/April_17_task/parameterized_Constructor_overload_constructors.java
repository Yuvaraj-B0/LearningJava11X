package Java_tasks.April_17_task;

public class parameterized_Constructor_overload_constructors {
    public static void main(String[] args) {
        Student1 s = new Student1("test1", 32, 125);
        System.out.println("Name from object s: " + s.name);

        Student1 s1 = new Student1("Ram", 24);
        System.out.println("Age from object s1: " + s1.age);
    }
}
class Student1 {
    String name;
    int age;
    int roll_no;

    Student1() {
        System.out.println("Default Constructor");
    }

    Student1(String name, int age, int roll_no) {
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
        System.out.println("Name: " + this.name + " | Age: " + this.age + " | Roll Number: " + this.roll_no);
    }

    Student1(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + this.name + " | Age: " + this.age);
    }
}