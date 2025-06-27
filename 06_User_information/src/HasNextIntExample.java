import java.util.Scanner;

public class HasNextIntExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } else {
            System.out.println("That's not a valid integer!");
        }

        scanner.close();
    }
}
