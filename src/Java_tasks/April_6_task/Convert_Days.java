package Java_tasks.April_6_task;

import java.util.Scanner;

public class Convert_Days {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1 year = 365 days, 1 month = 30 days
        System.out.print("Enter total number of days: ");
        int totalDays = scanner.nextInt();

        int years = totalDays / 365;
        int remainingDays = totalDays % 365;

        int months = remainingDays / 30;
        int days = remainingDays % 30;

        System.out.println(totalDays + " days is: " + years + " year(s), " + months + " month(s), and " + days + " day(s).");
    }
}
