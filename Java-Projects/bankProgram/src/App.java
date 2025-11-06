
import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0.00;
        int option;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("************************");
            System.out.println("WELCOME TO BANK APP JAVA!");
            System.out.println("************************");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("************************");
            System.out.print("Please select an option(1-4): ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("************************");
                    balance += deposit();
                    break;
                case 2:
                    System.out.println("************************");
                    balance -= withdraw(balance);
                    break;
                case 3:
                    System.out.println("************************");
                    showBalance(balance);
                    break;
                case 4:
                    System.out.println("************************");
                    System.out.println("ThankYou see you agian Bye...");
                    System.out.println("************************");
                    isRunning = false;
                    break;
                default:
                    System.out.println("************************");
                    System.out.println("Invalid choice...");
            }

        }

    }

    static double deposit() {
        double amount;
        System.out.print("Enter the amount to deposit: ");
        amount = sc.nextDouble();
        if (amount < 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
            return 0;
        } else {
            return amount;
        }
    }

    static void showBalance(double balance) {
        System.out.printf("Your current balance is: $%.2f\n", balance);
    }

    static double withdraw(double balance) {
        double amount = 0;

        System.out.print("Enter the amount to withdraw: ");
        amount = sc.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficient balance. Please enter a valid amount.");
            return 0;
        } else if (amount < 0) {
            System.out.println("Invalid amount. Please enter a positive value.");
            return 0;
        } else {
            balance -= amount;
            System.out.printf("You have withdrawn: $%.2f\n", amount);
        }

        return amount;
    }

}
