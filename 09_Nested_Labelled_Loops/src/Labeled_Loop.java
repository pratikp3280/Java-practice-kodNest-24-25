
public class Labeled_Loop {

	public static void main(String[] args) {
			
		outerLoop:
			for (int i = 1; i <= 5; i++) {
			    for (int j = 1; j <= 5; j++) {
			        if (i * j > 10) {
			            System.out.println("Breaking out of both loops!");
			            break outerLoop; // Jumping out of all the loops!
			        }
			        System.out.println("i: " + i + ", j: " + j);
			    }
			}

	}

}
