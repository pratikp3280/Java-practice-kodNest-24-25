package Thread_Life_cycle;

class SharedResource {
    synchronized void display() {
        System.out.println(Thread.currentThread().getName() + " is executing...");
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
    }
}

public class _3_BLOCKED_State {
    public static void main(String[] args) {
        SharedResource obj = new SharedResource();

        Thread t1 = new Thread(() -> obj.display(), "Thread-1");
        Thread t2 = new Thread(() -> obj.display(), "Thread-2");

        t1.start();
        t2.start();

        try 
        { Thread.sleep(100); } 
        catch (InterruptedException e) 
        {}

        System.out.println("Thread-2 State: " + t2.getState()); // BLOCKED
    }
}
