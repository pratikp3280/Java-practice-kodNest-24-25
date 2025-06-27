package Method_Abstraction;

public class JavaDeveloper extends Developer {
	
	@Override
	void work() {
		System.out.println("Java Developer is working on Java");
	}
	@Override
	void doProject() {
		System.out.println("Java Developer is Developing a Java Project");
	}
	
	void learnJava() {
		System.out.println("Java Developer is Learning a Java.");
	}
	
}
