package observer;

public class ClockTimer extends Subject {
	
	private int secondLimit = 59;
	private int minuteLimit = 59;
	private int hourLimit = 23;
	private int hour=0;
	private int minute=0;
	private int second=0;
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	void tick() {
		
		if(second >= secondLimit) {
			second = 0;
			if(minute >= minuteLimit ) {
				minute = 0;
				if(hour >= hourLimit) {
					hour=0;
				}else {
				hour++;
				}
				
			} else {
				minute++;
			}
		} else {
			second++;
		}
		
		notifyObservers();
	}

}
