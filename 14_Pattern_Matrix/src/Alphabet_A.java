
public class Alphabet_A {
	public static void main(String[] args) {
        int n = 11; // Size of the grid (10x10)

// Alphabet_C
        for (int i = 0; i < n; i++) { // Outer loop for rows
            for (int j = 0; j < n; j++) { // Inner loop for columns
                
                // Conditions for printing '*'
                if (i == 0 && j > 0 && j < n - 1 || // Top bar
                    j == 0 && i > 0 ||             // Left bar
                    j == n - 1 && i > 0 ||         // Right bar
                    i == n / 2) {                  // Middle bar
                    System.out.print("*");
                } 
                
                else {
                    System.out.print(" ");         // Space for other positions
                }
            }
            System.out.println(); // Move to the next line after each row
        }
        
        System.out.println();
 // Alphabet_B
        for (int i = 0; i < n; i++) { // Outer loop for rows
            for (int j = 0; j < n; j++) { // Inner loop for columns
                
                // Conditions for printing '*'
                if (i == 0  || // Top bar
                	i == 10 && j > 0 && j < n - 1 ||
                    j == 0 && i > 0 ||             // Left bar
                    j == n - 1 && i > 0 ||         // Right bar
                    i == n / 2) {                  // Middle bar
                    System.out.print("*");
                } 
                
                else {
                    System.out.print(" ");         // Space for other positions
                }
            }
            System.out.println(); // Move to the next line after each row
        }
        
        System.out.println();
// Alphabet_C
               for (int i = 0; i < n; i++) { // Outer loop for rows
                   for (int j = 0; j < n; j++) { // Inner loop for columns
                       
                       // Conditions for printing '*'
                       if (i == 0  && j>0 || // Top bar
                       	i == n-1 && j > 0  ||
                           j == 0 && i > 0 && i< n-1
                           ) 
                          
                           {                  
                           System.out.print("*");
                       } 
                       
                       else {
                           System.out.print(" ");         // Space for other positions
                       }
                   }
                   System.out.println(); // Move to the next line after each row
               }
        
               System.out.println();
 // Alphabet_D
                          for (int i = 0; i < n; i++) { // Outer loop for rows
                               for (int j = 0; j < n; j++) { // Inner loop for columns
                                   
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
                                       System.out.print(" ");         // Space for other positions
                                   }
                               }
                               System.out.println(); // Move to the next line after each row
                           }
        
                          System.out.println();
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
	
                            System.out.println();
 // Alphabet_F
                               for (int i = 0; i < n; i++) { // Outer loop for rows
                                   for (int j = 0; j < n; j++) { // Inner loop for columns
                                       
                                       // Conditions for printing '*'
                                       if (i == 0  ||                       // Top bar
                                           j == 0 && i > 0 ||             // Left bar
                                           i == n / 2) {                  // Middle bar
                                           System.out.print("*");
                                       } 
                                       
                                       else {
                                           System.out.print(" ");         // Space for other positions
                                       }
                                   }
                                   System.out.println(); // Move to the next line after each row
                               }
                               System.out.println();
// Alphabet_G
               for (int i = 0; i < n; i++) { // Outer loop for rows
                   for (int j = 0; j < n; j++) { // Inner loop for columns
                       
                       // Conditions for printing '*'
                       if (i == 0  && j>0 || // Top bar
                       	   i == n-1 && j > 0  ||
                           j == 0 && i > 0 && i< n-1 ||
                           j == n-1 && i>n/2 ||
                           i==6 && j>n/2
                           ) 
                          
                           {                  
                           System.out.print("*");
                       } 
                       
                       else {
                           System.out.print(" ");         // Space for other positions
                       }
                   }
                   System.out.println(); // Move to the next line after each row
               }                        
               System.out.println();
 // Alphabet_H
           for (int i = 0; i < n; i++) { // Outer loop for rows
               for (int j = 0; j < n; j++) { // Inner loop for columns
                   
                   // Conditions for printing '*'
                   if (j==0 || j==n-1 || i==n/2
                       ) 
                      
                       {                  
                       System.out.print("*");
                   } 
                   
                   else {
                       System.out.print(" ");         // Space for other positions
                   }
               }
               System.out.println(); // Move to the next line after each row
           }     
           
           System.out.println();
 // Alphabet_I
           for (int i = 0; i < n; i++) { // Outer loop for rows
               for (int j = 0; j < n; j++) { // Inner loop for columns
                   
                   // Conditions for printing '*'
                   if (i==0 || i==n-1 || j==n/2
                       ) 
                      
                       {                  
                       System.out.print("*");
                   } 
                   
                   else {
                       System.out.print(" ");         // Space for other positions
                   }
               }
               System.out.println(); // Move to the next line after each row
           }     
           
           
   System.out.println();
 // Alphabet_J
             for (int i = 0; i < n; i++) { // Outer loop for rows
                 for (int j = 0; j < n; j++) { // Inner loop for columns
                     
                     // Conditions for printing '*'
                     if (i==0 || i==n-1 && j<=n/2
                    		 || j==n/2 
                         ) 
                        
                         {                  
                         System.out.print("*");
                     } 
                     
                     else {
                         System.out.print(" ");         // Space for other positions
                     }
                 }
                 System.out.println(); // Move to the next line after each row
             }  
 System.out.println();
 // Alphabet_K
           for (int i = 0; i < n; i++) { // Outer loop for rows
               for (int j = 0; j < n; j++) { // Inner loop for columns
                   
                   // Conditions for printing '*'
                   if (j==0 || i-j== 5 || i+j ==5
                       ) 
                      
                       {                  
                       System.out.print("*");
                   } 
                   
                   else {
                       System.out.print(" ");         // Space for other positions
                   }
               }
               System.out.println(); // Move to the next line after each row
           }  
           
   System.out.println();
   // Alphabet_L
                     for (int i = 0; i < n; i++) { // Outer loop for rows
                         for (int j = 0; j < n; j++) { // Inner loop for columns
                             
                             // Conditions for printing '*'
                             if (
                                 j == 0 && i > 0 ||             // Left bar
                                 i == n-1 
                                ) {                  // Middle bar
                                 System.out.print("*");
                             } 
                             
                             else {
                                 System.out.print(" ");         // Space for other positions
                             }
                         }
                         System.out.println(); // Move to the next line after each row
                     }
   
 System.out.println();
 // Alphabet_M
           for (int i = 0; i < n; i++) { // Outer loop for rows
               for (int j = 0; j < n; j++) { // Inner loop for columns
                   
                   // Conditions for printing '*'
                   if (
                       j == 0      ||        // Left bar
                       j== n-1     || i==j && i<n/2 && j<n/2  
                       || i+j==10 && i<=n/2 
                      ) {                  
                       System.out.print("*");
                   } 
                   
                   else {
                       System.out.print(" ");         // Space for other positions
                   }
               }
               System.out.println(); // Move to the next line after each row
           }                
              
   System.out.println();
   // Alphabet_N
         for (int i = 0; i < n; i++) { // Outer loop for rows
             for (int j = 0; j < n; j++) { // Inner loop for columns
                 
                 // Conditions for printing '*'
                 if (
                     j == 0      ||        // Left bar
                     j== n-1     || i==j
                    ) {                  // Middle bar
                     System.out.print("*");
                 } 
                 
                 else {
                     System.out.print(" ");         // Space for other positions
                 }
             }
             System.out.println(); // Move to the next line after each row
         }   
     System.out.println();
  // Alphabet_C
         for (int i = 0; i < n; i++) { // Outer loop for rows
             for (int j = 0; j < n; j++) { // Inner loop for columns
                 
                 // Conditions for printing '*'
                 if (i == 0  && j>0 || // Top bar
                 	i == n-1 && j > 0  ||
                     j == 0 && i > 0 && i< n-1 ||
                     j==n-1 && i>0 && i<n-1
                     ) 
                    
                     {                  
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
