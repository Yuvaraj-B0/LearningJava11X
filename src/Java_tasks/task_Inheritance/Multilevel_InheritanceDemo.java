package Java_tasks.task_Inheritance;

class Person {
    String name;
    void showName() {
        System.out.println("Name: " + name);
    }
}

class Student_AT extends Person {
    int roll;
    void showRoll() {
        System.out.println("Roll: " + roll);
    }
}

class ATStudent extends Student_AT {
    String course;
    void showCourse() {
        System.out.println("Course: " + course);
    }
}

public class Multilevel_InheritanceDemo {
    public static void main(String[] args) {
        ATStudent s = new ATStudent();
        s.name = "Bob";
        s.roll = 101;
        s.course = "Selenium";
        s.showName();     // from Person
        s.showRoll();     // from Student
        s.showCourse();   // from ATBStudent
    }
}
