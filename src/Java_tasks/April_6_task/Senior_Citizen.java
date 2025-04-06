package Java_tasks.April_6_task;

import java.util.Scanner;

public class Senior_Citizen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Age falls under which group : ");
        int age = scanner.nextInt();
        if (age<0){
            System.out.println("Incorrect age please enter valid age");
        }else if (age>=0 && age<=12) {
            System.out.println("Your are Child");
        } else if (age>=13 && age<=19) {
            System.out.println("Your are Teenager");
        } else if (age>=20 && age<=64) {
            System.out.println("Your are Adult");
        }else {
            System.out.println("Your are Senior Citizen");
        }
    }
}
