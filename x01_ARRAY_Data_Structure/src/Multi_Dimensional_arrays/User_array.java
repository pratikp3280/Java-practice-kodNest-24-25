package Multi_Dimensional_arrays;
import java.util.Arrays;
import java.util.Scanner;
public class User_array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Length of an Array: ");
		int N = scan.nextInt();
		int[] grades = new int[N];
		
		System.out.println("Enter the array elements: ");
		for(int i = 0 ; i < grades.length ; i++) {
			
			grades[i] = scan.nextInt();
		}
		
			System.out.println("Your Array is Created Succesfully");
			System.out.println(Arrays.toString(grades));
			
			System.out.println("Enter the index Number Which You Want to Retrive Value: ");
			int index = scan.nextInt();
			
			System.out.println(grades[index]);
			
			
			
			scan.close();
	}

}
