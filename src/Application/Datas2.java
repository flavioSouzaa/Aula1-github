package Application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Datas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleDateFormat std3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:51:07Z"));
	
		Date x1 = new  Date();
		Date x2 = new Date();
		
		System.out.println("Data Exemplo formato = " + std3.format(d));
	
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY,4);
		d = cal.getTime();
		
		cal.setTime(x2);
		cal.add(cal.HOUR_OF_DAY, 5);
		x2 = cal.getTime();
		
		System.out.println("Data atualizada =      " + std3.format(d) );
		System.out.println("Data atual  =          "+std3.format(x1));
		System.out.println("Data 5 horas a mais =  "+ std3.format(x2));
	}

}
