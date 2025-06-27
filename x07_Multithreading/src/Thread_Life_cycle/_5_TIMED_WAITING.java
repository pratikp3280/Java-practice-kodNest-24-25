package Thread_Life_cycle;

public class _5_TIMED_WAITING {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(5000); // Moves to TIMED_WAITING
            } catch (InterruptedException e) {}
        });

        t1.start();

        try { Thread.sleep(1000); } catch (InterruptedException e) {}

        System.out.println("Thread State: " + t1.getState()); // TIMED_WAITING
    }
}
