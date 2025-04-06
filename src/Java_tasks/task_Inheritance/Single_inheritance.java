package Java_tasks.task_Inheritance;
class Student {
    String name;

    void display() {
        System.out.println("Student Name: " + name);
    }
}

class ATBStudent extends Student {
    String course;

    void showCourse() {
        System.out.println("Course: " + course);
    }
}

public class Single_inheritance {
    public static void main(String[] args) {
        ATBStudent AT =new ATBStudent();
        AT.course="java";
        AT.name="Tom";
        AT.display();      // from parent
        AT.showCourse();   // from child
    }
}
