package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHoraConversao {
	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2024-08-28");
		LocalDateTime d05 = LocalDateTime.parse("2024-08-28T12:37:26");
		Instant d06 = Instant.parse("2024-08-28T12:37:26Z");
		
		//convertendo para texto
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;	//iso_date_time é sem fuso horario
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		
		//formatando data-hora global... ZoneId.systemDefault pega a hora do pc do usuario
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println("d04 = " + d04.format(fmt1));
		System.out.println("d04 = " + fmt1.format(d04));
		System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("d05 = " + d05.format(fmt2));
		System.out.println("d05 = " + d05.format(fmt4));
		
		//passando o d06(hora global) para texto
		System.out.println("d06 = " + fmt3.format(d06));
		System.out.println("d06 = " + fmt5.format(d06));
		
		
	}

}
