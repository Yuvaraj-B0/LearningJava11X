package Java_tasks.task_Inheritance;

class Student_JA {
    String name;
    void showName() {
        System.out.println("Name: " + name);
    }
}

class JavaStudent extends Student_JA {
    void javaCourse() {
        System.out.println("Learning Java");
    }
}

class PythonStudent extends Student_JA {
    void pythonCourse() {
        System.out.println("Learning Python");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        JavaStudent j = new JavaStudent();
        j.name = "Charlie";
        j.showName();
        j.javaCourse();

        PythonStudent p = new PythonStudent();
        p.name = "Daisy";
        p.showName();
        p.pythonCourse();
    }
}