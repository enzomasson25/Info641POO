package tp2;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

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
		try {
			TimeUnit.SECONDS.sleep(duree);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TimeOutEvent te = new TimeOutEvent(this,duree);
		return te;
	}
	
	public PeriodicTimeEvent generatePeriodicTimeEvent(int i, int j) {
		PeriodicTimeEvent te = new PeriodicTimeEvent(this,i,j);
		return te;
	
	}
	
	
}
