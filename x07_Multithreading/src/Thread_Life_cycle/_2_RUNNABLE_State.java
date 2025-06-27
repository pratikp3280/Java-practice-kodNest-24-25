package Thread_Life_cycle;

public class _2_RUNNABLE_State {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread is running...");
        });

        t1.start(); // RUNNABLE state
        
        System.out.println("Thread State: " + t1.getState());
    }
}

// start() moves the thread to RUNNABLE, waiting for CPU execution.

