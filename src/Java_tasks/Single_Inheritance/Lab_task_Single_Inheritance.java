package Java_tasks.Single_Inheritance;

public class Lab_task_Single_Inheritance {
    public static void main(String[] args) {
        Son_task so=new Son_task();
        so.Sontask();
        so.Fathertask();
        System.out.println("The son owns "+so.sonowns());
        System.out.println("The Father owns "+so.Fowns());
    }
}
