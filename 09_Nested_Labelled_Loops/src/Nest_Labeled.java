
public class Nest_Labeled {

	public static void main(String[] args) {
		outerLoop:
			for (int classroom = 1; classroom <= 3; classroom++) {
			    for (int student = 1; student <= 10; student++) {
			        int score = (int)(Math.random() * 100); // Random score between 0 and 99
			        System.out.println("Classroom: " + classroom + ", Student: " + student + ", Score: " + score);
			        if (score > 90) {
			            System.out.println("Found a student with more than 90 marks in Classroom " + classroom);
			            break outerLoop; // Exit both loops immediately
			        }
			    }
			}

	}

}
