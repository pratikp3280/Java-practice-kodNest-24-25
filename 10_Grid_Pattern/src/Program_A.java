
public class Program_A {

	public static void main(String[] args) {
		int n = 11; // Size of the grid (10x10)

		
		        for (int i = 0; i < n; i++) { // Outer loop for rows
		            for (int j = 0; j < n; j++) { // Inner loop for columns
		                
		                
		                if (i == 0 && j > 0 && j < n - 1 || 
		                    j == 0 && i > 0 ||             
		                    j == n - 1 && i > 0 ||         
		                    i == n / 2) {                  
		                    System.out.print("*");
		                } 
		                
		                else {
		                    System.out.print(" ");         
		                }
		            }
		            System.out.println(); 
		        }
		        
		        System.out.println();

	}

}
