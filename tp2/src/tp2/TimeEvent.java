package tp2;

import java.util.Date;
import java.util.EventObject;
import java.util.GregorianCalendar;

public class TimeEvent extends EventObject{

		private GregorianCalendar date_evenement;

		public TimeEvent(Object source) {
			super(source);
			this.date_evenement = new GregorianCalendar();
		}

		public Date getDate_evenement() {
			return date_evenement.getTime();
		}

		

		
		
		
}
