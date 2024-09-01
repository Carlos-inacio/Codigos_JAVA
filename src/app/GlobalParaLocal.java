package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class GlobalParaLocal {
	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		//convertendo global para data local
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		//convertendo global para data de Portugal
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		
		System.out.println("d04 dia = " + d04.getDayOfMonth());
		System.out.println("d04 dia = " + d04.getMonthValue());
		System.out.println("d04 dia = " + d04.getYear());
		
		System.out.println("d05 dia = " + d05.getHour());
		System.out.println("d05 dia = " + d05.getMinute());
	}

}
