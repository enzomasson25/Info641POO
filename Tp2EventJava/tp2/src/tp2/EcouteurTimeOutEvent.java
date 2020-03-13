package tp2;

import java.util.concurrent.TimeUnit;

public class EcouteurTimeOutEvent implements TimeOutEventListener,Ecouteurs{
	
	public void actionPerformed(TimeOutEvent e) {
		try {
			TimeUnit.SECONDS.sleep(e.getDuree());
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(e.getDate_evenement());
		}

	
}
