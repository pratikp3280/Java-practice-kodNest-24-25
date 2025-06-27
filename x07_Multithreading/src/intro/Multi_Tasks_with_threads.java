package intro;

public class Multi_Tasks_with_threads {

	public static void main(String[] args) {
		
		VideoThread vt =  new VideoThread();
		vt.setName("Video");
		ChatThread ct =  new ChatThread();
		ct.setName("chat");
		ScreenThread st = new ScreenThread();
		st.setName("screen-share");
		
		vt.start();
		ct.start();
		st.start();
	}
}

	class VideoThread extends Thread {
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
	
	class ChatThread extends Thread {
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

	
	class ScreenThread extends Thread {
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


