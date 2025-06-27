package intro;

public class Multi_Tasks_with_Runnable {

	public static void main(String[] args) {
		
		//Task Creation
		VideoThread vt =  new VideoThread();
		ChatThread ct =  new ChatThread();
		ScreenThread st = new ScreenThread();
		
		//Thread creation
		Thread t1 = new Thread(vt);
		t1.setName("Vedio Thread");
		
		Thread t2 = new Thread(ct);
		t2.setName("Chat Thread");
		
		Thread t3 = new Thread(st);
		t2.setName("Screen-share Thread");
		
		
		
		//Start thread
		t1.start();
		t2.start();
		t3.start();
	}
}

	class VideoThread implements Runnable {
		public void run() {
			String t = Thread.currentThread().getName();
			for(int i = 0; i <= 5; i++) {
				System.out.println(t + " thread is executing. .. ...");
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException ex1) {
					ex1.printStackTrace();
				}
			}
		}
	}
	
	class ChatThread implements Runnable {
		public void run() {
			String t = Thread.currentThread().getName();
			for(int i = 0; i <= 5; i++) {
				System.out.println(t + " thread is executing. .. ...");
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException ex2) {
					ex2.printStackTrace();
				}
			}
		}
	}

	
	 class ScreenThread implements Runnable {
		public void run() {
			String t = Thread.currentThread().getName();
			for(int i = 0; i <= 5; i++) {
				System.out.println(t + " thread is executing. .. ...");
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException ex3) {
					ex3.printStackTrace();
				}
			}
		}
	}


