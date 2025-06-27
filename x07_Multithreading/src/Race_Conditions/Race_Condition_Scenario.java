package Race_Conditions;

class BankAccount {
    private int balance = 1000; // Initial balance

    public void deposit(int amount) {
        int newBalance = balance + amount; // Read current balance
        try {
            Thread.sleep(100); // Simulating delay
        } catch (InterruptedException e) {}
        balance = newBalance; // Update balance
    }

    public int getBalance() {
        return balance;
    }
}

public class Race_Condition_Scenario {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount();

        // Two threads depositing ₹500 at the same time
        Thread t1 = new Thread(() -> account.deposit(500));
        Thread t2 = new Thread(() -> account.deposit(500));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance: ₹" + account.getBalance()); // Incorrect balance! :- Final Balance: ₹1500  (Instead of ₹2000)
    }
}



// A race condition :=- two or more threads try to access and modify shared resources simultaneously
// without proper synchronization. 
// This leads to unexpected behavior, data corruption, or inconsistent results in multithreaded applications.


/* 
 * Race conditions can be prevented using:
1.Synchronized keyword
2.ReentrantLock 
3.AtomicInteger for atomic operations 
 */