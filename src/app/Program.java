package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {	
	public static void main(String[] args) {
		
		DateTimeFormatter formato1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//data de agora(local)
		LocalDate d01 = LocalDate.now();
		
		//Hora e data atual(local)
		LocalDateTime d02 = LocalDateTime.now();
		
		//data e hora global
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2024-08-27");
		LocalDateTime d05 = LocalDateTime.parse("2024-08-27T01:30:26");
		Instant d06 = Instant.parse("2024-08-27T01:30:26Z");
		Instant d07 = Instant.parse("2024-08-27T01:30:26-03:00");
		
		//texto customizado
		LocalDate d08 = LocalDate.parse("28/08/2024", formato1);
		LocalDateTime d09 = LocalDateTime.parse("28/08/2024 12:17", formato2);
		
		//sequencia: ano, mes, dia
		LocalDate d10 = LocalDate.of(2024, 8, 28);
		//sequencia: ano, mes, dia, hora, minuto
		LocalDateTime d11 = LocalDateTime.of(2024, 8, 28, 12, 23);
		
		System.out.println("d01: " + d01);
		System.out.println("d02: " + d02);
		System.out.println("d03: " + d03);
		System.out.println("d04: " + d04);
		System.out.println("d05: " + d05);
		System.out.println("d06: " + d06);
		System.out.println("d07: " + d07);
		System.out.println("d08: " + d08);
		System.out.println("d09: " + d09);
		System.out.println("d10: " + d10);
		System.out.println("d11: " + d11);
	}

}
