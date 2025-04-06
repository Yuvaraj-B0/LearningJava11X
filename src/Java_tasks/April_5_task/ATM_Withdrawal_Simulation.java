package Java_tasks.April_5_task;
import java.util.Scanner;

public class ATM_Withdrawal_Simulation {
    public static void main(String[] args) {
        int account_bal = 10000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Amount to be withdrawn from the Account");
        // Check if input is an integer BEFORE reading it
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a whole number.");
            return;  // Exit the program if input is not valid
        }

        int with_amt = scanner.nextInt();

        if (with_amt <= 0) {
            System.out.println("The withdraw amount should be greater than zero");
        } else if (with_amt % 100 != 0) {
            System.out.println("Amount must be a multiple of 100.");
        } else if (with_amt >= account_bal) {
            System.out.println("The amount should not exceed the account balance");
        }else {
            account_bal = account_bal - with_amt;
            System.out.println("withdrawal Completed!!");
            System.out.println("After Deducation the current balance is : " + account_bal);
        }
    }
}
