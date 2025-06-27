
 class Laptop { 
	 //Instance variables 
	 String laptopId;
	 String brand;
	 double price;
	 
	 
	 //Creating behaviors of an object
	 void switchOn() {
		 System.out.println("Laptop is ON"); 
	 }
	 
	 void shutDown() {
		 System.out.println("Laptop is OFF"); 
	 }
	 
	 void displayInfo() {
		 
		 System.out.println("Information Of the Laptop: "+brand); 
		 System.out.println(laptopId);
		 System.out.println(brand);
		 System.out.println(price);
		 
	 }
}
