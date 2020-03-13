package tp2;

import java.util.EventObject;

public class PeriodicTimeEvent extends TimeEvent{
	
	private int periode;
	private int nb;
	
	public int getPeriode() {
		return periode;
	}
	public int getNb() {
		return nb;
	}
	
	
	public PeriodicTimeEvent(Object source, int periode, int nb) {
		super(source);
		this.periode = periode;
		this.nb = nb;
	}
	
	
	
}
