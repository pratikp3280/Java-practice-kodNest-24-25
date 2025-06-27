package Static_vs_Instance;

public class Main {
    public static void main(String[] args) {
        // Static block is executed before the main method starts
        System.out.println("Welcome to the Banking System!");

        // Creating account objects
        Bank account1 = new Bank("Alice", 1000);
        Bank account2 = new Bank("Bob", 2000);

        // Calculate interest for each account using the static interest rate
        account1.calculateInterest();
        account2.calculateInterest();

        // Update the interest rate using the static method
        Bank.updateInterestRate(4.0);

        // Calculate interest again after updating the rate
        account1.calculateInterest();
        account2.calculateInterest();
    }
}
