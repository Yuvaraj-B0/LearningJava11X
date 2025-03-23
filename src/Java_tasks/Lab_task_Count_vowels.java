package Java_tasks;

import java.util.Scanner;

public class Lab_task_Count_vowels {
    public static void main(String[] args) {
        String string;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to count the vowels: ");
        string=sc.nextLine();
        sc.close();
        string=string.toLowerCase();
        int vow=0 , con =0, nostring=0;
        for (int i=0;i<string.length();i++){
            char ch=string.charAt(i);
            if(ch >= 'a'&& ch<='z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vow++;
                }else {
                    con++;
                }
            }else {
                nostring++;
            }
        }
        if (nostring<=0)
        {
            System.out.println("The enter the sting has no char in it from a to z");
        }else {
            System.out.println("The Vowels count in the enter string is: " + vow);
            System.out.println("And the Consonants counts is: " + con);
        }

    }
}
