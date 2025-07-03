package Question3;

import java.util.Scanner;


public class BankTransactionApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 12-digit account number: ");
        String accountNumber = input.nextLine();

        try {
            if (accountNumber.length() < 10){
                throw new InvalidAccountNumber();
            }
        } catch (InvalidAccountNumber e) {
            System.out.println(e.getMessage());

        }

        System.out.print("Enter Withdrawal amount: ");
        double amount = input.nextDouble();

        try {
            if (amount > 1000.00){
                throw new InsufficientBalance();
            } else {
                System.out.println("Withdrawal successful!");
                double remaining = amount-1000.00;
                System.out.println("Remaining balance: " + remaining);
            }
        } catch (InsufficientBalance e) {
            System.out.println(e.getMessage());
        }

    }
}
