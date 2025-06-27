package intro;
public class Sring_Operations {

	public static void main(String[] args) {
		
		String str = " KodNest tech ";
		
		System.out.println(str.length());     // -14
	
		System.out.println(str.toUpperCase());     // kODNEST TECH
		
		System.out.println(str.toLowerCase());	   // kodnest tech
		
		System.out.println(str.charAt(3));		   // N
		
		System.out.println(str.indexOf('e'));		// 4
		
		System.out.println(str.lastIndexOf('e'));	// 9
		
		System.out.println(str.concat("PVT Ltd"));	// KodNest techPVT Ltd
		
		System.out.println(str.startsWith("Kod"));	// true
		System.out.println(str.startsWith("Java")); //false
		
		System.out.println(str.contains("N"));		//true
		System.out.println(str.contains("Nest"));	//true
		
		System.out.println(str.endsWith("Tech"));	//true
		System.out.println(str.endsWith("kod"));	// false
		
		System.out.println(str.substring(4));		//est tech
		
		System.out.println(str.substring(0,9));   //est t
		
		System.out.println(str.isEmpty());			//false
		
		System.out.println(str.length());			//12
		
		System.out.println(str.replace("N" , "B"));	// KodBest tech
		
		System.out.println(str.toCharArray());     // KodBest tech
		
		System.out.println(str.trim());      // Removes spaces at end and start
	}

}

























