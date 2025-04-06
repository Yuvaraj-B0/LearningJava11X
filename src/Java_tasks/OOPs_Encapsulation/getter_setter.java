package Java_tasks.OOPs_Encapsulation;

public class getter_setter {
public static void main(String[] args) {
    ATB a1 = new ATB("Java", "Dave", 10000);
//        System.out.println(a1.course);
    System.out.println(a1.getCourse());
    System.out.println(a1.getname());
    System.out.println(a1.getCostOfCourse());
    a1.setCourse("Python");
    a1.setname("Rava");
    System.out.println("----------");
    System.out.println(a1.getCourse());
    System.out.println(a1.getname());
    System.out.println("----------");
    a1.setCostOfCourse(12000, true);
    System.out.println(a1.getCostOfCourse());

}
}

class ATB {

    private String course;
    private String name;
    private float costOfCourse;

    ATB(String course, String name, float costOfCourse) {

        this.course = course;
        this.name = name;
        this.costOfCourse = costOfCourse;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public float getCostOfCourse() {
        return costOfCourse;
    }

    public void setCostOfCourse(float costOfCourse, boolean isAdmin) {
        if (isAdmin) {
            this.costOfCourse = costOfCourse;
        } else {
            System.out.println("you are not allowed to change the cost of the course");
        }
    }
}