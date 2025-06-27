
public class Program_E {

	public static void main(String[] args) {
		int n = 11 ; 
		// Alphabet_E
        for (int i = 0; i < n; i++) { // Outer loop for rows
            for (int j = 0; j < n; j++) { // Inner loop for columns
                
                // Conditions for printing '*'
                if (i == 0  ||                       // Top bar
                    j == 0 && i > 0 ||             // Left bar
                    i == n-1 ||
                    i == n / 2) {                  // Middle bar
                    System.out.print("*");
                } 
                
                else {
                    System.out.print(" ");         // Space for other positions
                }
            }
            System.out.println(); // Move to the next line after each row
        }

	}

}
