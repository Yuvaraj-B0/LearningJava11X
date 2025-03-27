package games;

import java.util.Random;
import java.util.Scanner;

public class oddOReven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random rom= new Random();
        int userNumber;
        Boolean userWins=false;
        int att=0;
        System.out.println("Welcome to the Odd or Even Game!");

        while (!userWins) {
            String userchoice= UserChoice();
            while (true) {
                System.out.print("Enter your number (0 to 10): ");
                userNumber = sc.nextInt();
                if (userNumber < 0 || userNumber > 10) {
                    System.out.println("Invalid number. Please choose a number between 0 and 10.");
                } else {
                    break;
                }
            }
            int computerNumber = rom.nextInt(11); // 0 to 10
            int sum = userNumber + computerNumber;
            att++;
            System.out.println("You chose: " + userNumber);
            System.out.println("Computer chose: " + computerNumber);
            System.out.print("Sum is: " + sum + " - which is " + (sum % 2 == 0 ? "Even" : "Odd"));
            boolean isEven = sum % 2 == 0;

            if ((isEven && userchoice.equals("even")) || (!isEven && userchoice.equals("odd"))) {
                System.out.println(" And  🎉 You win!");
                System.out.println("You win the game in "+(att==1 ? "First attempt." : (""+att+" attempts.")));
                userWins=true;
            } else {
                System.out.println(" And 😢 Computer wins!");
            }

        }

    }

    public static String UserChoice() {
        String userchoice;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Choose Odd or Even (type 'odd' or 'even'): ");
            userchoice = sc.nextLine().toLowerCase();

            if (userchoice.equals("odd") || userchoice.equals("even")) {
                break;
            } else {
                System.out.println("Invalid choice. Please restart and choose 'odd' or 'even'.");
            }

        }

        return userchoice;
    }
}
