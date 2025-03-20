package Java_tasks;

import java.util.Scanner;

public class LAb011_task_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Fibonacci Series:");
        int a = 0, b = 1, sum;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            sum = a + b;
            a = b;
            b = sum;
        }
        /* out put
        Enter the number of terms: 7
        Fibonacci Series:
        0 1 1 2 3 5 8
         */
    }
    }
