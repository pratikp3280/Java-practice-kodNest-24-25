package Example;

public class Bike extends Vehicle {
	
	@Override
	void start() {
		System.out.println("Bike is Started");
		}
	
	@Override
    void move() {
    	System.out.println("Bike is Moving");
	}
	@Override
	void stop() {
		System.out.println("Bike is Stopped");
	}
}
