package Java_tasks.April_5_task;

import java.util.Scanner;

public class Largest_of_3_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int num1 = scanner.nextInt();
        System.out.println("Enter Second Number : ");
        int num2 = scanner.nextInt();
        System.out.println("Enter Second Number : ");
        int num3 = scanner.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("First Number is max : " +num1);
        } else if (num2 > num3) {
            System.out.println("Second Number is max : " +num2);
        }else {
            System.out.println("Third Number is max : " +num3);
        }
    }
}
