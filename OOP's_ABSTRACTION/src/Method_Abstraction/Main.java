package Method_Abstraction;


public class Main {
	
	public static void main(String[] args) {
//		Developer ref;
	accessDeveloper(new JavaDeveloper());
	System.out.println("------------------------------------");
	accessDeveloper(new PythonDeveloper());
	System.out.println("------------------------------------");
	}
	
	public static void accessDeveloper (Developer ref) {
		ref.work();
		ref.doProject();
		ref.attendMeeting();
		
		
		
		if(ref instanceof JavaDeveloper) {
			((JavaDeveloper)(ref)).learnJava();
			
		}
		else if(ref instanceof PythonDeveloper) {
			((PythonDeveloper)(ref)).learnPython();
		}
		else {
			
		}
		
	}
}
