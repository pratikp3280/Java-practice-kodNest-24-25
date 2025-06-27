package intro;

public class Sring_to_charArray {

	public static void main(String[] args) {
		
		String str = "KodNest";
		// converting String into Char type Array using: toCharArray()
		
		char[] arr = str.toCharArray();
		
		//converting back into string using: new keyword
		
		String newstr = new String(arr);
		
		System.out.println(str);
		
		System.out.println(newstr);
		
		int length_of_array = 0;
		
		for(char x : arr) {
			System.out.print(x + " ");
			length_of_array++;
		}
		System.out.println();
		System.out.println("Length of an array is : "+ length_of_array);
	}
	

}
