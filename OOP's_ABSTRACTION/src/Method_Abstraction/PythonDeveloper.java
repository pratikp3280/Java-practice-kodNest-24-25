package Method_Abstraction;

public class PythonDeveloper extends Developer {
	
	@Override
	void work() {
		System.out.println("Python Developer is working on python");
	}
	@Override
	void doProject() {
		System.out.println("Python Developer is Developing a python Project");
	}
	
	void learnPython() {
		System.out.println("Python Developer is Learning a python.");
	}
}
