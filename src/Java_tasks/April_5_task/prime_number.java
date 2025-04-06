package Java_tasks.April_5_task;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is prime: ");
        int num = scanner.nextInt();
        boolean isPrime = true;
        System.out.println(Math.sqrt(num));
        if (num<=1){
            System.out.println(num + " is  not a prime number.");
        }
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

}
