package Method_Types;

//Void Methods: Perform an action but do not return any value.
public class voidTypeMethod {

	
	//Method Calling inside Main Method
	public static void main(String[] args) {
		voidTypeMethod greet = new voidTypeMethod();
        greet.sayHello();
    }
	
	//Method Definition
	void sayHello() {
        System.out.println("Hello, World!");
        //no return value
    }

}
