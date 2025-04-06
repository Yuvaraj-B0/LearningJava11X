package Java_tasks.April_4_task;

import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the single Character to know it's Vowel or Consonant : ");
        char char1 = scanner.next().charAt(0);
        char ch = Character.toLowerCase(char1);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("This is a Vowel");
        }else {
            System.out.println("This is a Consonant");
        }

    }
}
