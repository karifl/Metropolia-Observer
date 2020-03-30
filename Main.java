package observer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClockTimer cuckoo = new ClockTimer();
		
		DigitalClock digiCuckoo = new DigitalClock(cuckoo);
		digiCuckoo.run();
		

	}

}
