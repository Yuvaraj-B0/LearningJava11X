package Java_tasks.April_5_task;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year to check it's Leap Year : ");
        int year = scanner.nextInt();
        if (year <= 0) {
            System.out.println("Not an correct year");
        }else if (year%4 == 0) {
            System.out.println("This is leap Year");
        }else {
            System.out.println("This is not leap Year");
        }
    }
}
