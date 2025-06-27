
public class StaticDemo {

	public static void main(String[] args) {
		

			//accessing static [EO|iNONGHES
			System.out.println("x = " + Class_Have_Static.x);
			Class_Have_Static.fun1();
			//accessing non-static EONPONGHES
			Class_Have_Static sd = new Class_Have_Static(); //object creation
			System.out.println("y = " + sd.y);
			sd.fun2();

			}

	}


