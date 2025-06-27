package UpCasting;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoftwareEngineer Developer = new SoftwareEngineer();     //Parent class Instantiation 
		Developer.work();
		
		Developer.project();
		System.out.println("-------------------------------------------");
		
		
		 Developer = new FrontEndDeveloper();		// upcasting
		 Developer.project();                       //go inside the FrontEndDeveloper child class and takes the method project()
		 System.out.println("-------------------------------------------");
		 
		 Developer = new BackendDeveloper();		// upcasting
		 Developer.project();						//go inside the  BackendDeveloper child class and takes the method project()
		 System.out.println("-------------------------------------------");
		 
		 Developer = new DatabaseEngineer();		// upcasting
		 Developer.project();						//go inside the  DatabaseEngineer child class and takes the method project()
		 System.out.println("-------------------------------------------");
	}
	
	
	


}
