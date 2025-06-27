package Method_Types;

//Non-Static Methods: Require an object to invoke them.
public class nonStaticMethod {

	public static void main(String[] args) {
		nonStaticMethod example = new nonStaticMethod();    //instantiate:- Object Creation using new keyword
	        example.showMessage(); // Object required

	}
	
	
	void showMessage() {
        System.out.println("This is a non-static method.");
        
    }

}
