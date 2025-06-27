package Serialization_DeSerialization;

public class Singleton_Pattern_Resolved {

	public static void main(String[] args) {
		
		Sun s1 = Sun.getObject();        //calling getObject() method for Object Creation
		Sun s2 = Sun.getObject();
		Sun s3 = Sun.getObject();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		
		System.out.println("Number of objects created = " + Sun.count);
		
	}

}

class Sun {
	static int count = 0;
	static Sun obj;
	
	private Sun() {
		count++;       // counting the number of object created 
		System.out.println("Constructor was called " + " new Object Created");
		
	}
	
	public static Sun getObject() {                
		if(count == 0) {
			obj = new Sun();
		}
		else {
			System.out.println("New Object not Created");
		}
		
		return obj;
	}
}
