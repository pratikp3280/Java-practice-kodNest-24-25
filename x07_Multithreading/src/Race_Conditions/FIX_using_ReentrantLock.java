package Race_Conditions;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockBankAccount {
    private int balance = 1000;
    private final Lock lock = new ReentrantLock(); // Lock object

    public void deposit(int amount) {
        lock.lock(); // Acquire lock
        try {
            int newBalance = balance + amount;
            Thread.sleep(100);
            balance = newBalance;
        } catch (InterruptedException e) {} 
        finally {
            lock.unlock(); // Release lock
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class FIX_using_ReentrantLock {
    public static void main(String[] args) throws InterruptedException {
        LockBankAccount account = new LockBankAccount();

        Thread t1 = new Thread(() -> account.deposit(500));
        Thread t2 = new Thread(() -> account.deposit(500));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance: ₹" + account.getBalance()); // ✅ Correct Balance: ₹2000
    }
}
