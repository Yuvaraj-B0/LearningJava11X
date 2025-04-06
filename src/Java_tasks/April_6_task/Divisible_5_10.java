package Java_tasks.April_6_task;

import java.util.Scanner;

public class Divisible_5_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number To check it's divisible by 5 and 11 : ");
        int num = scanner.nextInt();

        if (num%5 ==0 && num%11 == 0) {
            System.out.println("The number "+num+" is divisible by both 5 and 11");
        } else if (num%5 == 0) {
            System.out.println("The Number "+num+" is divisible by 5");
        } else if (num%11 == 0) {
            System.out.println("The Number "+num+" is divisible by 11");
        } else {
            System.out.println("The Number "+num+" is not divisible by both 5 and 11");
        }
    }
}
