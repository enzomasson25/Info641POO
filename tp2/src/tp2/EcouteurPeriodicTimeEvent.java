package tp2;

import java.util.concurrent.TimeUnit;

public class EcouteurPeriodicTimeEvent implements PeriodicTimeEventListener,Ecouteurs{
	
	public void actionPerformed(PeriodicTimeEvent e) {
		
			
			try {
				for (int value = 0; value < e.getNb(); value = value + 1) {
					System.out.println(e.getDate_evenement());
					TimeUnit.SECONDS.sleep(e.getPeriode());
				}
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	}
}


