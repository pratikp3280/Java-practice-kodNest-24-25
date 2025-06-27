package While_loop;

public class while_Example2 {

	public static void main(String[] args) {
		int i = 1;			//initializing i for Outer While loop
		
		//Outer while loop
		while(i<=5) {
			int j = 1;		//initializing j for inside the Outer while loop
			
			//Inner while loop
			while(j<=5) {
				System.out.println("i:"+i +"\tj:"+j);
				j++;       //incrementing j for inner while loop
			}
			System.out.println();  	 		//adding a blank line after every outer loop
			i++;							//increment i for outer loop
		}

	}

}
