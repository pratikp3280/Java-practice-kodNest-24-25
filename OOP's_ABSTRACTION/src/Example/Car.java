package Example;

public class Car extends Vehicle{
	@Override
	void start() {
		System.out.println("Car is Started");
		}
	@Override
    void move() {
    	System.out.println("Car is Moving");
	}
	@Override
	void stop() {
		System.out.println("Car is Stopped");
	}
}
