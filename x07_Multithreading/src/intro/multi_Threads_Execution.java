package intro;

public class multi_Threads_Execution {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Thread.currentThread());
		for(int i= 0; i <= 10 ; i++) {
			System.out.println("Typing sub-Task Executing. .. ...");
			Thread.sleep(1000);
		}
		
		for(int i= 0; i <= 10 ; i++) {
			System.out.println("Saving  sub-Task Executing. .. ...");
			Thread.sleep(1000);
		}
		
		for(int i= 0; i <= 10 ; i++) {
			System.out.println("Error check sub-Task Executing. .. ...");
			Thread.sleep(1000);
		}

	}

}
