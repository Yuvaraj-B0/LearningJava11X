package Java_tasks.April_12_task;

import java.util.Scanner;

public class While_loop_task {
    public static void main(String[] args) {
        System.out.println("Print Numbers from 10 to 1 (Reverse Order)");
        int i=10;
        while (i>0){
            System.out.println(i);
            i--;
        }
        System.out.println("==================================");
        System.out.println("Calculate the sum of numbers from 1 to 100");
        i=1;
        int sum=0;
        while (i<=100)
        {
          sum=sum+i;
          i++;
        }
        System.out.println("the sum of 1 to 100 is: "+sum);
        System.out.println("==================================");
        System.out.println("Multiplication Table of a Given Number (take the input from user)");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Table number");
        int t=sc.nextInt();
        i=1;
        while (i<=10){
            System.out.printf(t+" * "+i+" = "+(t*i)+"\n");
            i++;
        }
        System.out.println("==================================");
        System.out.println("Factorial of a Number");
        int num = 6;
        int factorial = 1;
        i=1;
        while (i<=num){
            factorial = factorial * i;
            i++;
        }
        System.out.print("Factorial of the Number is : ");
        System.out.println(factorial);
        System.out.println("==================================");
        System.out.println("Check if a Number is Prime");
        int nums = 2;
        int count = 0;
        i = 2;
        while (i< nums) {
            if (nums %i == 0) {
                count++;
                break;
            }
            i++;
        }
        if (count == 0) {
            System.out.println("This is a Prime Number");
        }else {
            System.out.println("This is Composite Number");
        }


    }
}
