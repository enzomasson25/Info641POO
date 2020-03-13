package tp2;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Generator {
	
	private ArrayList<Ecouteurs> ecouteurs = new ArrayList<Ecouteurs>();
	
	public void addEcouteur(Ecouteurs e) {
		this.ecouteurs.add(e);
	}
	
	public TimeEvent generateTimeEvent() {
		TimeEvent te = new TimeEvent(this);
		return te;
	}
	
	public TimeOutEvent generateTimeOutEvent(int duree) {
		TimeOutEvent te = new TimeOutEvent(this,duree);
		return te;
	}
}
