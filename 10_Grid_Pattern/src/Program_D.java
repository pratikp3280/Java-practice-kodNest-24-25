
public class Program_D {

	public static void main(String[] args) {
		int n =11;
		// Alphabet_D
        for (int i = 0; i < n; i++) { 
             for (int j = 0; j < n; j++) { 
                 
                 // Conditions for printing '*'
                 if (i == 0  && j < n - 1 ||           // Top bar
                 	   i == n-1  && j< n-1 ||       // 	bottom bar
                     j ==  0    ||
                     j == n-1 && i>0 && i<n-1
                     ) 
                    
                     
                     {                  
                     System.out.print("*");
                 } 
                 
                 else {
                     System.out.print(" ");         
                 }
             }
             System.out.println(); // Move to the next line after each row
         }
	}

}
