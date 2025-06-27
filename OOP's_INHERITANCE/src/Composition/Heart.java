package Composition;

public class Heart {
	int heartBeat = 72;
	String color = "Real";
	
	void pumpBlood() {
		System.out.println("Heart is pumping blood");
	}
	
	void heartInfo(Heart ref) {
		System.out.println("Heartbeat of Person is : " + ref.heartBeat);
		System.out.println("Heartcolor of Person is" + ref.color);
	}
}
