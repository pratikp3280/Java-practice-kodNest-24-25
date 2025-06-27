package Teaching_Inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathsTeacher Mt = new MathsTeacher();
		Mt.work();
		Mt.teach();
		Mt.doMathsProblems();
		System.out.println("------------------------------------");
		
		ScienceTeacher St = new ScienceTeacher();
		St.work();
		St.teach();
		St.doscienceExperiments();
		

		
		//Annotation : 
		//Comments : 
		
	  // @Upcasting
		Teacher tr = new Teacher();
		tr.work();
		tr.Teach();
		
//		tr = new MathsTeacher();
		tr = Mt;			//upcasting the child class to parent class
		tr.work();
		tr.Teach();
		
//		tr = new ScienceTeacher();
		tr = St;
		tr.work();
		tr.Teach();
		
		

		
		
	   
	   
	}

}
