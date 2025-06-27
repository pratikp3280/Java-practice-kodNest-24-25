package Thread_Life_cycle;

public class _6_TERMINATED_State {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread is running...");
        });

        t1.start();

        try { Thread.sleep(100); } catch (InterruptedException e) {}

        System.out.println("Thread State: " + t1.getState()); // TERMINATED
    }
}
