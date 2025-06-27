package $continue;

public class BreakContinueExample {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue; // Skip even numbers
            }
            System.out.println("Odd number: " + i);
            count++;
            if (count == 5) {
                break; // Stop after finding 5 odd numbers
            }
        }
    }
}
