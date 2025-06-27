
public class Program_C {

	public static void main(String[] args) {
		int n = 11;
		// Alphabet_C
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
                
              
                if (i == 0  && j>0 ||
                	i == n-1 && j > 0  ||
                    j == 0 && i > 0 && i< n-1
                    ) 
                   
                    {                  
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
