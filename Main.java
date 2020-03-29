package observer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter = 0;
		int limit = 4800;
		
		ClockTimer cuckoo = new ClockTimer();
		
		DigitalClock digiCuckoo = new DigitalClock(cuckoo);
		
		
		
		for (counter=0 ;counter < limit; counter++) {
			cuckoo.tick();

		}
		
	}

}
