package Java_tasks;

import java.util.Scanner;

public class Lab_task_Palidrome {
    public static void main(String[] args) {
        Scanner pa=new Scanner(System.in);
        System.out.print("Enter the String :");
        String Pali=pa.nextLine();
        String Pali_RE="";
        for (int i = Pali.length()-1; i >= 0; i--) {
            Pali_RE = Pali_RE+Pali.charAt(i);
        }
        System.out.println("Reversed string: " +Pali_RE);
        // Check if the original and reversed strings are the same
        if (Pali.equals(Pali_RE)) {
            System.out.println("The string is a Palindrome!");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }
    }
}
