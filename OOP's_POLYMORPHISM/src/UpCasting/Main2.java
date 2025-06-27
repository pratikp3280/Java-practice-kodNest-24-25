package UpCasting;

public class Main2 {

	public static void main(String[] args) {
		
		SoftwareEngineer Developer1  = new FrontEndDeveloper();
		DoProject(Developer1);
		
		SoftwareEngineer Developer2  = new BackendDeveloper();
		DoProject(Developer2);
		
		SoftwareEngineer Developer3  = new DatabaseEngineer();
		DoProject(Developer3);

	}
	//Achiving PolyMorphism using separate Method Craetion 
	public static void DoProject(SoftwareEngineer Developer) {
		Developer.work();
		Developer.project();
		System.out.println("-------------------------------------------");
	}

}
