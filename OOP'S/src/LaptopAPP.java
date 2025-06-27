
 class LaptopAPP {

	public static void main(String[] args) {
		//creating an Object-1 by telling JVM Through new Keyword
		Laptop  l1 = new Laptop();
		
		
		l1.laptopId = "L123";
		l1.brand = "DELL";
		l1.price = 45000.54;
		l1.displayInfo();
		l1.switchOn();
		System.out.println();
		
		
		
		
		//creating an Object-2 by telling JVM Through new Keyword
		Laptop  l2 = new Laptop();
		
		
		l2.laptopId = "L555";
		l2.brand = "HP";
		l2.price = 55000.78;
		l2.displayInfo();
		l2.switchOn();
		l2.shutDown();
		
		
		

	}

}
