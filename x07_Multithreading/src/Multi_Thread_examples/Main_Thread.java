package Multi_Thread_examples;

class Main_Thread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Step 1: Main thread starts");
        Thread.sleep(1000);

        // Performing some operations
        for (int i = 1; i <= 3; i++) {
            System.out.println("Step " + (i + 1) + ": Processing in main thread...");
            try {
                Thread.sleep(1000); // Pausing execution for 1 second
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted");
            }
        }

        System.out.println("Step 5: Main thread ends");
    }
}
