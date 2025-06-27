package intro;

public class String_Creation {

	public static void main(String[] args) {
		
		//First way
		String str1 = "Kodnest";
		System.out.println("first way: "+ str1);	
		
		//Second way
		String str2 = new String("Kodnest");
		System.out.println("second way: "+ str2);
		
		//Third way
		char [] arr = {'K', 'o', 'd', 'n', 'e', 's', 't'};
		String str3 = new String(arr);
		System.out.println("third way: " +str3);
		

	}

}
