package Teaching_Inheritance;

public class MathsTeacher extends Teacher {
	String teacher = "Maths";
	
//	@Override method 
	void teach() {
		System.out.println("Maths Teacher is teaching a Maths to students.");
	}
	
	void doMathsProblems() {
		System.out.println("Maths Teacher is Solving  a Maths Problems.");
	}
}
