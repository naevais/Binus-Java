import java.util.Scanner;

public class Latihan6 {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

   System.out.println("=== ATM MENU ===");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Cash");
        System.out.println("3. Deposit Cash");
        System.out.println("4. Exit");
        System.out.print("Please select an option (1-4): ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalidinput! Please enter a valid number, not text or letters.");
            scanner.close();
            return;
        }

        double balance = 1000000;

        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.printf("Your current balance is: Rp %.0f\n", balance);
            }
            case 2 -> {
                System.out.print("Enter withdrawal amount (multiples of 50,000): Rp ");
                
                if (!scanner.hasNextDouble()) {
                    System.out.println("[Error] Invalid input! Withdrawal amount must be a number.");
                    break;
                }
                double amount = scanner.nextDouble();

                if (amount > balance) { 
                    System.out.println("Insufficient balance for this transaction!");
                } else if (amount <= 0) {
                    System.out.println(" Withdrawal amount must be greater than 0!");
                } else if (amount % 50000 != 0) {
                    System.out.println(" Withdrawal amount must be in multiples of Rp 50,000!");
                } else {
                    balance -= amount;
                    System.out.printf("Successfully withdrew Rp %.0f. Remaining balance: Rp %.0f\n", amount, balance);
                }
            }
            case 3 -> {
                System.out.print("Enter deposit amount (minimum Rp 10,000): Rp ");
                
                if (!scanner.hasNextDouble()) {
                    System.out.println("[Error] Invalid input! Deposit amount must be a number.");
                    break;
                }

                double deposit = scanner.nextDouble();

                if (deposit < 10000) {
                    System.out.println("Deposit amount must be at least Rp 10,000!");
                } else {
                    balance += deposit;
                    System.out.printf("Successfully deposited Rp %.0f. New balance: Rp %.0f\n", deposit, balance);
                }
            }
            case 4 -> {
                System.out.println("Thank you for using our ATM. Goodbye!");
            }
            default -> {
        
                System.out.println("Invalid option! Please select a number between 1 and 4.");
            }
        }

        scanner.close();
    }
}
