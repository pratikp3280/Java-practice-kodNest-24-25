
public class TypeCastingExample {

	public static void main(String[] args) {
		char ch = 'A';
		
        //char to other Datatypes conversion
		byte bytevalue = (byte) ch;
		short shortvalue = (short) ch;
		int intvalue =  ch;
		long longvalue =  ch;
		float floatvalue =  ch;
		double doublevalue = ch;
		System.out.println(" char to other Datatype conversion");
		System.out.println("char: " +ch);
		System.out.println("byte:"+bytevalue);
		System.out.println("int: "+intvalue);
		System.out.println("long :"+longvalue);
		System.out.println("float :"+floatvalue);
		System.out.println("double :"+doublevalue);
	}

}
