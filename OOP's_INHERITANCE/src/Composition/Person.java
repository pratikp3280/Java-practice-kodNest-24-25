package Composition;

import Laptop_Person.Laptop;

public class Person {
	Heart hr = new Heart();
	
	String name = "Amith";                      
    
	void work() {                               
		System.out.println("Person is Working");
	}     
	
	void personLaptopDetails(Laptop ref) {                                    
		System.out.println("Persons laptop Processor is: " + ref.processor ); 
		System.out.println("Persons laptop OS is: " + ref.OS);                
		ref.switchOn();                                                       
		ref.shutDown();                                                       
	}                                                                         
}
