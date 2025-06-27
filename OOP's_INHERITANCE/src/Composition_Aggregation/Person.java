package Composition_Aggregation;

public class Person extends Human {
	Heart hrt = new Heart();
	   
    Brain br = new Brain();
	
	
	void work() {
		System.out.println("Person is Working...");
	}
	
	void accessBike() {
		
	}
	
	void accessMobile() {
		
	}

}
