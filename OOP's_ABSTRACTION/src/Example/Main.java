package Example;

public class Main {

	public static void main(String[] args) {
		accessVehicle(new Car());
		
		accessVehicle(new Bike());
		
	}
	
	static void accessVehicle(Vehicle vcl) {
		vcl.start();
		vcl.stop();
		vcl.move();
		System.out.println("____________")	;
		}
	

}
