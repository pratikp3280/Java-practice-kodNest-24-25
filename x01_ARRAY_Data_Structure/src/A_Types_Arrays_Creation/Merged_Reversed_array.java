package A_Types_Arrays_Creation;

public class Merged_Reversed_array {
		public static void main(String[] args) {
			
			int arr1[] = {10,20,30,40};
			int arr2[] = {50,60,70};
			
			int size = arr1.length + arr2.length;
			int[] arr3 = new int[size];
			
			for(int i=0; i < arr1.length; i++) {
			
					     arr3[i] = arr1[arr1.length-1-i];
			}
			int x = 0;
			for(int i = arr1.length; i < arr3.length ; i++) {
						
				          arr3[i] = arr2[arr2.length-1-x];
				          x++;
				}
			
			System.out.println("Merged Reversed array elemnts are: ");
			System.out.print("{ ");
			for(int i = 0; i < arr3.length; i++) {
				
				System.out.print( arr3[i] + " ");
			}
			
			System.out.print(" }");

		}
		

	}