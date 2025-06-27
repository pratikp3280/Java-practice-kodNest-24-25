package Type_3;
import java.util.Random;

//Methods without Parameters but with Return Values
public class RandomNumber {
	int getRandomNumber() { // Method without parameters but with return value
        Random random = new Random();
        return random.nextInt(100); // Return a random number between 0-99
    }

    public static void main(String[] args) {
        RandomNumber randomNumber = new RandomNumber();
        int number = randomNumber.getRandomNumber(); // Call the method and store the return value
        System.out.println("Generated Random Number: " + number);
    }
}
