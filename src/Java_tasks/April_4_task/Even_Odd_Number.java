package Java_tasks.April_4_task;

import java.util.Scanner;

public class Even_Odd_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number To check Even or Odd : ");
        int num = scanner.nextInt();
        if (num%2 == 0) {
            System.out.println("The Number is Even");
        }else {
            System.out.println("The Number is Odd");
        }
    }
}
