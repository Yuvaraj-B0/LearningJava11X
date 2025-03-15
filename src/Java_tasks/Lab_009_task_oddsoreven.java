package Java_tasks;

import java.util.Scanner;

public class Lab_009_task_oddsoreven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to check odd or even: ");
        int Num=sc.nextInt();
        if (Num%2==0)
        {
            System.out.println("The number " + Num + " is Even.");
            //out put The number 2 is Even.
        }
        else {
            System.out.println("The number " + Num + " is odds.");
        }
    }
}
