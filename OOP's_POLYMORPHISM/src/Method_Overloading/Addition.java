package Method_Overloading;

public class Addition {
	
		int add(int a , int b) {
			return a+b;
		}
		
		float add(float a , float b) {
			return a+b;
		}
		
		double add(double a , double b) {
			return a+b;
		}
		
		int add(int a , int b, int c) {
			return a+b+c;
		}
		
		double add(int a , float b, double c) {
			return a+b+c;
		}
		
		double add(float a , double b, int c) {
			return a+b+c;
		}
		
}
