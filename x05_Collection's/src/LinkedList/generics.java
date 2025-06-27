package LinkedList;

public class generics {

	public static void main(String[] args) {
		printValue(10);
		printValue(3.45);
		printValue("Java");
		printValue(true);
		printValue('p');

	}
	
	public static <T> void printValue(T val) {
		System.out.println(val);
	}

}
