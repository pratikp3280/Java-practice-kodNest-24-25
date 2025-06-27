package Thread_Life_cycle;

class _4_WAITING_State {
    public static void main(String[] args) {
        final Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Thread is waiting...");
                    lock.wait();                  // Moves to WAITING state
                    System.out.println("Thread resumed...");
                } catch (InterruptedException e) {}
            }
        });

        t1.start();

        try { Thread.sleep(2000); } catch (InterruptedException e) {}

        System.out.println("Thread State: " + t1.getState()); // WAITING
    }
}
