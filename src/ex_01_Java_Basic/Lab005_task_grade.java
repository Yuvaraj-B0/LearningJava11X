package ex_01_Java_Basic;


import java.util.Scanner;

public class Lab005_task_grade {
    public static void main(String[] args) {
        int st_score;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your score:");
        st_score=sc.nextInt();
        // Now Grading system works with nested ternary operator
        String st_grade = (st_score<=59)?"Your Grade for scoring "+st_score+" is F"
                :(st_score<=69)?"Your Grade for scoring "+st_score+" is D"
                :(st_score<=79)?"Your Grade for scoring "+st_score+" is C"
                :(st_score<=89)?"Your Grade for scoring "+st_score+" is B"
                :(st_score<=100)?"Your Grade for scoring "+st_score+" is A"
                :"Your have enter score is "+st_score+" it's beyond 100 Please Enter Correct Score under 100";
        System.out.println(st_grade);
        /* if your input is 89
        Then output will like this
        Your Grade for scoring 89 is B
         */
        sc.close();
    }
}
