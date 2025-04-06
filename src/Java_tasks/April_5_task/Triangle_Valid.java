package Java_tasks.April_5_task;

import java.util.Scanner;

public class Triangle_Valid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Side 1 of the Triangle : ");
        int a = scanner.nextInt();
        System.out.println("Enter the Side 2 of the Triangle : ");
        int b = scanner.nextInt();
        System.out.println("Enter the Side 3 of the Triangle : ");
        int c = scanner.nextInt();

        if(a==b && a==c && b==c){
            System.out.println("This is valid Triangle");
        }else {
            System.out.println("this is not valid Triangle");
        }
    }
}
