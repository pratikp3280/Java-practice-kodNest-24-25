package intro;

public class MultiThreading_With_join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Kodnest service has Started. .. ...");
		
		Training t = new Training();
		t.start();
		
		Placements p = new Placements();
		p.start();
		
		System.out.println("Kodnest service has Stopped. .. ...");

	}

}

class Training extends Thread {
	public void run() {
		System.out.println("Training has Started");
		for(int i =1; i<5; i++) {
			System.out.println("Training is going on");
			
		}
		System.out.println("Training has ended");
	}
}  

class Placements extends Thread {
	public void run() {
		System.out.println("Placements started");
		for(int i =1; i<5; i++) {
			System.out.println("Placement is going on");
			
		}
		System.out.println("placement ended");
	}
}         


