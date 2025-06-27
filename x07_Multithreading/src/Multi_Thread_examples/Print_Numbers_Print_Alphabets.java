package Multi_Thread_examples;

public class  Print_Numbers_Print_Alphabets{
    public static void main(String[] args) {
        NumberThread t1 = new NumberThread();
        LetterThread t2 = new LetterThread();

        t1.start(); // Start number thread
        t2.start(); // Start letter thread
    }
}

class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(2000); // Pause for 2sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class LetterThread extends Thread {
    public void run() {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("Letter: " + ch);
            try {
                Thread.sleep(2000); // Pause for 2sec
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

