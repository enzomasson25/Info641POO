package tp2;

import java.util.GregorianCalendar;

public class TimeOutEvent extends TimeEvent{

	private int duree;

	public int getDuree() {
		return duree;
	}

	public TimeOutEvent(Object source, int duree) {
		super(source);
		this.duree = duree;
	}
	
}
