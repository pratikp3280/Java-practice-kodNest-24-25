package Multi_Dimensional_arrays;

public class Three_Dimension_array {

	public static void main(String[] args) {
		
//		int[][][] my3DArray = new int[2][3][4]; // A 3D array with 2 layers, 3 rows, and 4 columns
		
		int[][][] my3DArray = {
				{
					{1, 2, 3,  4},
					{5, 6, 7,  8},
					{9,10, 11, 12}
				},
				{
					{13, 14, 15, 16},
					{17, 18, 19, 20},
					{21, 22, 23, 24}
				}
			};
		
//		// Accessing the element at layer 1, row 2, column 3
//		int value = my3DArray[1][2][3]; 
//		
//		// Modifying the element at layer 0, row 1, column 2
//		my3DArray[0][1][2] = 100; 
		
		System.out.println("3D Array are: [");
		for (int i = 0; i < my3DArray.length; i++) {         				//my3DArray.length     	  gives Number of Layer/block
			System.out.println("[ ");
			for (int j = 0; j < my3DArray[i].length; j++) {					//my3DArray[i].length  	  gives Number of Rows in each layer
				System.out.print("[ ");
				for (int k = 0; k < my3DArray[i][j].length; k++) 			//my3DArray[1][j].length  gives Number of Columns in each rows
				{
						System.out.print(my3DArray[i][j][k] + " " );
				}
					System.out.print("]");
					System.out.println();
				
				}
			System.out.println(" ]");
			}
	}

}
