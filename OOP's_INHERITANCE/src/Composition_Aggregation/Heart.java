package Composition_Aggregation;

public class Heart extends Person {
		int heartBeat;
		
		void pumpBlood(Person ref) {
			System.out.println("Heart is Pumping Blood...");
		}
}
