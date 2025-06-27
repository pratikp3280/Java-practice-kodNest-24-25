package Interface;

public class Main {

	public static void main(String[] args) {
		accessdevMethods(new JavaDeveloper());
		accessdevMethods(new PythonDeveloper());

	}
	
	
	static void accessdevMethods(Developer dev) {
		dev.work();
		dev.doProject();
		System.out.println("---------------------------------------");
	}

}
