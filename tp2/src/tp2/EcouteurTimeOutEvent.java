package tp2;

import java.util.concurrent.TimeUnit;

public class EcouteurTimeOutEvent implements TimeOutEventListener,Ecouteurs{
	
	public void actionPerformed(TimeOutEvent e) {
			System.out.println(e.getDate_evenement());
		}

	
}
