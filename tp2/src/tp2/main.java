package tp2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;

public class main {

	public static void main(String[] args) {
		
		Generator g = new Generator();
		
		EcouteurTimeEvent e = new EcouteurTimeEvent();
		EcouteurTimeOutEvent oe = new EcouteurTimeOutEvent();
		EcouteurPeriodicTimeEvent pe = new EcouteurPeriodicTimeEvent();
		
		g.addEcouteur(e);
		g.addEcouteur(oe);
		g.addEcouteur(pe);
		System.out.println("Envoi du message :");
		e.actionPerformed(g.generateTimeEvent());
		System.out.println("Réception du message :");
		oe.actionPerformed(g.generateTimeOutEvent(2));
		System.out.println("Périodique :");
		pe.actionPerformed(g.generatePeriodicTimeEvent(2,5));
	}

}
