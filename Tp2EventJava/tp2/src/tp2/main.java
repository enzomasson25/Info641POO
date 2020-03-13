package tp2;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;

public class main {

	public static void main(String[] args) {
		
		Generator g = new Generator();
		
		EcouteurTimeEvent e = new EcouteurTimeEvent();
		EcouteurTimeOutEvent oe = new EcouteurTimeOutEvent();
		
		g.addEcouteur(e);
		g.addEcouteur(oe);
		oe.actionPerformed(g.generateTimeOutEvent(2));
	}

}
