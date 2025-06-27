package Multiple_Inheritance;

public class Main {

	public static void main(String[] args) {
		
		DoctorRobot dr = new DoctorRobot();
		EngineerRobot er = new EngineerRobot();
		CleaningRobot cr = new CleaningRobot();
		
		SoftwareEngineerRobot ser = new SoftwareEngineerRobot();
		CivilEngineerRobot cer  = new CivilEngineerRobot();
		
		Robotics.work();
		dr.surgery();
		System.out.println("------------------------------------");
		
		er.creation();
		System.out.println("------------------------------------");
		
		cr.cleaning();
		System.out.println("------------------------------------");
	}

}
