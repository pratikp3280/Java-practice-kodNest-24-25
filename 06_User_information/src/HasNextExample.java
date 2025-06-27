import java.util.Scanner;

public class HasNextExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        System.out.println("Enter words (type 'exit' to stop):");
        while (scanner.hasNext()) {
           
            if(scanner.hasNextInt()) {
            	 System.out.println("You entered: integer " + word);
            }
            else if(word.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("You entered: " + word);
        }

        scanner.close();
    }
}

