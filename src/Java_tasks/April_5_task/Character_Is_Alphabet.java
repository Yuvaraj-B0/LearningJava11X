package Java_tasks.April_5_task;

import java.util.Scanner;

public class Character_Is_Alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Character to know it's Alphabet");
        char ch = scanner.next().charAt(0);

        if(Character.isAlphabetic(ch)){
            System.out.println("This is an Alphabet");
        }else {
            System.out.println("This is not an Alphabet");
        }
    }
}
