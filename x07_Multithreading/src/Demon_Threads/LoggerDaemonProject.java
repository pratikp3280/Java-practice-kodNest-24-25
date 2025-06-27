package Demon_Threads;

import java.util.Scanner;

public class LoggerDaemonProject {

    public static void main(String[] args) throws InterruptedException {
        // Daemon thread that logs system time every 3 seconds
        Thread loggerThread = new Thread(() -> {
            while (true) {
                System.out.println("[LOGGER] System running at: " + System.currentTimeMillis());
                try {
                    Thread.sleep(3000); // Sleep 3 seconds
                } catch (InterruptedException e) {
                    System.out.println("[LOGGER] Logger interrupted!");
                }
            }
        });

        loggerThread.setDaemon(true); // Must be before start()
        loggerThread.start();         // Start the daemon

        // User thread - simulate main program accepting input
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("=== Welcome to Task Logger ===");
        System.out.println("Type your tasks. Type 'exit' to quit.\n");

        while (true) {
            System.out.print("Task: ");
            input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program...");
                Thread.sleep(2000);
                System.out.println("Program Exited Successfully.");
                break; // exit the loop => user thread ends => JVM ends => daemon ends
            }

            System.out.println("✅ Task Saved: " + input);
        }

        sc.close();
    }
}
