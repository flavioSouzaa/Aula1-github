package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdt1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdt2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdt3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdt3.setTimeZone(TimeZone.getTimeZone("GMT"));;
		
		Date x1 = new  Date();
		Date x2 = new Date(System.currentTimeMillis());
		
		Date y1 = sdt1.parse("25/06/2019");
		Date y2 = sdt2.parse("25/06/2019 15:48:55");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println("\n---------------\n");
		System.out.println("x1 " + sdt2.format(x1));
		System.out.println("x2 " + sdt2.format(x2));
		System.out.println("y1 " + sdt2.format(y1));
		System.out.println("y2 " + sdt2.format(y2));
		System.out.println("\n---------------\n");
		System.out.println("x1 " + sdt3.format(x1));
		System.out.println("x2 " + sdt3.format(x2));
		System.out.println("y1 " + sdt3.format(y1));
		System.out.println("y2 " + sdt3.format(y2));
		
		
		
		System.out.println("Horario UTC");
		System.out.println("\n---------------\n");
		System.out.println(sdt2.format(y3));
		System.out.println("\n---------------");
	}

}
