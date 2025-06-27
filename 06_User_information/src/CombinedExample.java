import java.util.Scanner;

public class CombinedExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (type 'exit' to stop):");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                System.out.println("Valid number: " + number);
            } else {
                String input = scanner.next(); // Consume invalid input
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                System.out.println("Invalid input, not a number: " + input);
            }
        }

        scanner.close();
    }
}
