package Java_tasks.multilevel_Inheritance;

public class Lab_task_Multilevel_Inheritance {
    public static void main(String[] args) {
        Son_task1 S1=new Son_task1();
        S1.gatask();
        S1.fatask();
        S1.sontask();
        System.out.println("___________________________________________________");
        System.out.println("Son gold owns "+S1.s_Gown);
        System.out.println("___________________________________________________");
        S1.home();
        System.out.println("___________________________________________________");
        System.out.println("Dynamic Dispatch");
        Ga_Father_task S2=new Father_task1();
        S2.home();

        Father_task1 S3=new Son_task1();
        S3.home();




    }
}
