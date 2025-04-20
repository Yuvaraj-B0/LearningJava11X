package Java_tasks.April_12_task;

import java.util.Scanner;

public class For_loop_task {
    public static void main(String[] args) {
        System.out.println("Print Numbers from 10 to 1 (Reverse Order)");
        for (int i=10;i>0;i--)
        {
            System.out.println(i);
        }
        System.out.println("==================================");
        System.out.println("Calculate the sum of numbers from 1 to 100");
        int sum = 0;
        for (int i=1;i<=100;i++)
        {
            sum=sum+i;
        }
        System.out.println("The Sum of Number from 1 to 100 : "+sum);
        System.out.println("==================================");
        System.out.println("Multiplication Table of a Given Number (take the input from user)");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number for which you want to print the table : ");
        Integer t=sc.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.printf(t+" * "+i+" = "+(t*i)+"\n");
        }
        System.out.println("==================================");
        System.out.println("Factorial of a Number");
        int num = 6;
        int factorial = 1;
        for (int i = 1; i <= num ; i++) {
            factorial = factorial * i;
        }
        System.out.print("Factorial of the Number is : ");
        System.out.println(factorial);
        System.out.println("==================================");
        System.out.println("Check if a Number is Prime");
        int num1 = 7;
        int i, count = 0;
        for (i = 2; i < num1; i++) {
            if (num1 %i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println(num1+"This is a Prime Number");
        }else {
            System.out.println(num1+"This is Composite Number");
        }
        System.out.println("==================================");


    }
}
