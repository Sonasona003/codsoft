import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            System.out.println("Invalid amount for deposit.");
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("not have enough money for withdraw.");
            return false;
        }
    }

    public double checkBalance() {
        return balance;
    }
}

class ATM {
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void displayOptions() {
        System.out.println("1. checkbalance");
        System.out.println("2. withdraw");
        System.out.println("3. deposit");
        System.out.println("4. Exit");
    }

    public void start() {
        while (true) {
            displayOptions();
            System.out.print("Enter your preference: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter amount for withdraw: ");
                    double withdrawAmount = Double.parseDouble(scanner.nextLine());
                    if (account.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Withdrawal failed.");
                    }
                    break;
                case "2":
                    System.out.print("Enter amount for deposit: ");
                    double depositAmount = Double.parseDouble(scanner.nextLine());
                    if (account.deposit(depositAmount)) {
                        System.out.println("your amount is deposited.");
                    } else {
                        System.out.println("your amount is not deposited.");
                    }
                    break;
                case "3":
                    System.out.println("Your balance is: " + account.checkBalance());
                    break;
                case "4":
                    System.out.println("Thank you for using the ATM. ");
                    scanner.close();
                    return;
                default:
                    System.out.println("Incorrect choice. Please enter valid option.");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Starting balance of 1000
        ATM atm = new ATM(account);
        atm.start();
    }
}
