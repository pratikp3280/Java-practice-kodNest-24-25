package Thread_Life_cycle;


public class _1_NEW_State {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); 		 // NEW state
        
        System.out.println("Thread State: " + t1.getState()); // Output: NEW
    }
}

class MyThread extends Thread {
	
    public void run() {
        System.out.println("Thread is running...");
    }
}

