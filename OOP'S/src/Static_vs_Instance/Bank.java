package Static_vs_Instance;

class Bank {
    // Static variable to represent a universal interest rate
    static double interestRate;

    // Static block to initialize static variables (one-time setup)
    static {
        interestRate = 3.5; // Default interest rate for all accounts
        System.out.println("Static block executed: Interest rate set to " + interestRate + "%");
    }

    // Static method to change the interest rate (can be done without creating objects)
    static void updateInterestRate(double newRate) {
        interestRate = newRate;
        System.out.println("Static method executed: Interest rate updated to " + interestRate + "%");
    }

    // Instance variables (specific to an account)
    String accountHolderName;
    double balance;

    // Constructor to initialize instance variables
    Bank(String accountHolderName, double initialDeposit) {
        this.accountHolderName = accountHolderName;
        this.balance = initialDeposit;
    }

    // Instance method to calculate interest for this account
    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest for " + accountHolderName + ": $" + interest);
    }
}



