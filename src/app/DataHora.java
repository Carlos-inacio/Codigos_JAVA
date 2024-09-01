package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {
	
	public static void main(String[] args) {
		
		//Formatação data e hora
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");
		
		//Data local atual
		LocalDate d01 = LocalDate.now();
		//Data e Hora local atual
		LocalDateTime d02 = LocalDateTime.now();
		//Data e hora global atual
		Instant d03 = Instant.now();	//Em Londres está 3 horas a frente do horário local(RJ)
		
		LocalDate d04 = LocalDate.parse("2024-08-28");
		LocalDateTime d05 = LocalDateTime.parse("2024-08-28T11:51");
		Instant d06 = Instant.parse("2024-08-28T11:54:03Z");
		Instant d07 = Instant.parse("2024-08-28T11:55:03-03:00");
		
		LocalDate d08 = LocalDate.of(2024, 8, 28);
		LocalDateTime d09 = LocalDateTime.of(2024, 8, 28, 11, 58);
		//Para usar data e hora formatada use o .parse("data formatada", variavel de formatacao)
		LocalDate d10 = LocalDate.parse("29/08/2024", f1);
		LocalDateTime d11 = LocalDateTime.parse("29/08/24 12:05", f2);
		
		
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		
	}

}
