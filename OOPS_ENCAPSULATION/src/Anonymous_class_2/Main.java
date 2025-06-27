package Anonymous_class_2;

public class Main {

	public static void main(String[] args) {
		
		Calculator calc = new  Calculator() {
			
			@Override public void add() {
				System.out.println(10+5);
			}
			
			@Override public void sutract() {
				System.out.println(10-5);
			}
			
		}
	}

}
