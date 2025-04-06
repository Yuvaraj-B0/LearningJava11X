package Java_tasks.OOPs_Encapsulation;

public class StudentArray {
    public static void main(String[] args) {
        // Create an array to store ATB students
        ATB_st[] students = new ATB_st[3];

        // Add student objects
        students[0] = new ATB_st(1, "Tom", "Java");
        students[1] = new ATB_st(2, "Jack", "Python");
        students[2] = new ATB_st(3, "James", "Selenium");


        // Print all students
        System.out.println("ATB Students List:");
        for (int i = 0; i < students.length; i++) {
           System.out.println(students[i]);  // toString() will be called automatically
        }

        students[0].setId(5,false);


    }

}


class ATB_st {
    // Private fields (Encapsulation)
    private int id;
    private String name;
    private String course;

    // Constructor
    public ATB_st(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }


    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id,boolean admin) {
        if (admin)
        {
            this.id = id;
        }else {
            System.out.println("Your not admin to change id");
        }
    }
    public  String toString() {
        return "ATB { ID: " + id + ", Name: '" + name + "', Course: '" + course + "' }";
    }

}
