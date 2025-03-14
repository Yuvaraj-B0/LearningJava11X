package ex_01_Java_Basic;

public class Lab_007_task_userinput_CLI {
    public static void main(String[] args) {
        String Name = args[0];
        int age = Integer.parseInt(args[1]);
        int Salary = Integer.parseInt(args[2]);
        System.out.println("Name:"+Name+"\n"+"Age:"+age+"\n"+"Salary: "+Salary);

        /* Output will be look like
        Name:Test_user
        Age:27
        Salary: 50000
        */

    }
}
