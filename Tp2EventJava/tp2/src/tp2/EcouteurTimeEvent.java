package tp2;

public class EcouteurTimeEvent implements TimeEventListener,Ecouteurs{
	
	public void actionPerformed(TimeEvent e) {
		System.out.println(e.getDate_evenement());
		}
	
	
}
