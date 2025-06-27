package Composition;

import Laptop_Person.Laptop;

public class Main {

	public static void main(String[] args) {
		Laptop lap = new Laptop();
        lap.switchOn();
        lap.laptopInfo();
        lap.shutDown();
		
		Person per = new Person();
		per.personLaptopDetails(lap);
		
		
		Heart hr = new Heart();
		hr.pumpBlood();
		hr.heartInfo(hr);
        
		
		
	}

}
