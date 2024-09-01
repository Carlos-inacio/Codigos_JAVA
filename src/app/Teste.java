package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;


public class Teste {
	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.parse("2024-09-01");
		LocalDateTime d02 = LocalDateTime.parse("2024-09-01T14:35:00");
		Instant d03 = Instant.parse("2024-09-01T14:35:00Z");
		LocalDateTime r1 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
		LocalDateTime r2 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));
		
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter f3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		DateTimeFormatter f5 = DateTimeFormatter.ISO_INSTANT;
		
		

		
		
		System.out.println("d01 = " + f1.format(d01));
		System.out.println("d02 = " + f2.format(d02));
		System.out.println("d03 = " + f3.format(d03));
		System.out.println("d03 = " + f5.format(d03));
		System.out.println(r1);
		System.out.println(r2);
		
		
		
		
		
	}

}
