package Serialization_DeSerialization;

import java.io.*;

public class Serialize_deserialize_Singleton {

	public static void main(String[] args) throws Exception {
		
		Sun s = Sun.getObject();
		
		//1. Serialize (s)
		FileOutputStream fos = new FileOutputStream("sample.txt");
		ObjectOutputStream oos  = new ObjectOutputStream(fos);
		oos.writeObject(s);
		
		//2. DeSerialize (s)
		FileInputStream fis = new FileInputStream("sample.txt");
		ObjectInputStream ois  = new ObjectInputStream(fis);
		Sun s2 = (Sun) ois.readObject();
		
		//3. printing Hashcode of Objects That Created
		System.out.println(" Serialize Object Hashcode : " + s.hashCode());
		System.out.println("DeSerialize Object Hashcode : " + s2.hashCode());
		
	}

}

class Sun {
	static int count = 0;
	static Sun obj;
	
	private Sun() {
		count++;
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
	
	//Ensuring that same instance is returned during DeSerialization
	protected Object readResolve() {
		return getObject();
	}
}