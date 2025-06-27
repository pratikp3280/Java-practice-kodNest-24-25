
public class Alphabet_Curved_S {

	public static void main(String[] args) {
		int n=11;
		// Alphabet_S
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
                
                
                if (i==0   || 
                	i==n-1 ||
                	(j==0 && i<n/2) ||
                	i==n/2  ||
                	(j==n-1 && i>n/2)
                	 ) {                  
                    System.out.print("*");
                } 
                
                else {
                    System.out.print(" ");         
                }
            }
            System.out.println(); 
        }
        
        System.out.println(); 
        System.out.println(); 
        
        for (int i = 0; i < n; i++) { 
            for (int j = 0; j < n; j++) { 
                
                
                if ((i==0 && j<n/2  )|| 
                	(i==n-1 && j<n/2) ||
                	(j==0 && i<n/2 ) ||
                	i==n/2 &&  j<n/2||
                	(j==n/2 && i>n/2)
                	 ) {                  
                    System.out.print("*");
                } 
                
                else {
                    System.out.print(" ");         
                }
            }
            System.out.println(); 
        }

	}

}
