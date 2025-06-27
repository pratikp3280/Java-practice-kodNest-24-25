package Race_Conditions;

public class FIX_using_Synchronized {
    public static void main(String[] args) throws InterruptedException {
        SafeBankAccount account = new SafeBankAccount();

        Thread t1 = new Thread(() -> account.deposit(500));
        Thread t2 = new Thread(() -> account.deposit(500));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance: ₹" + account.getBalance()); // ✅ Correct Balance: ₹2000
    }

}

class SafeBankAccount {
    private int balance = 1000;

    public synchronized void deposit(int amount) { // Synchronized method
        int newBalance = balance + amount;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {}
        balance = newBalance;
    }

    public synchronized int getBalance() {
        return balance;
    }
}



/*
 * Solution:1: Synchronization (synchronized keyword)
Ensures that only one thread can execute the critical section at a time.


 *  */
 