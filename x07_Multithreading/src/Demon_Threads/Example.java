package Demon_Threads;



public class Example {

	public static void main(String[] args) {
		
		VideoThraed vt = new VideoThraed();
		
		PictureThread pt = new PictureThread();
		pt.setDaemon(true);
		pt.setPriority(1);
		
		NoiseThread nt = new NoiseThread();
		nt.setDaemon(true);
		nt.setPriority(1);
		
		vt.start();
		pt.start();
		nt.start();
		
	}

}

class VideoThraed extends Thread {
	public void run() {
		
		try {
			for(int i = 0 ;i <= 10 ;i++) {
			System.out.println("Video is Playing.....");
			Thread.sleep(500);
			}
		}
		catch(InterruptedException ie) {
			System.out.println("Some Exception Occured. .. ..");
		}
	}
}

class PictureThread extends Thread {
	public void run() {
		
		try {
			for(;;) {
			System.out.println("Enhancing Picture Quality. ..");
			Thread.sleep(500);
			}
		}
		catch(InterruptedException ie) {
			System.out.println("Some Exception Occured. .. ..");
		}
	}
}

class NoiseThread extends Thread {
	public void run() {
		
		try {
			System.out.println("Noise Reduction. ..");
			Thread.sleep(500);
		}
		catch(InterruptedException ie) {
			System.out.println("Some Exception Occured. .. ..");
		}
	}
}

// Pratik Patil |

