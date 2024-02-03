package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatterBuilder.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Formato customizado
		
		LocalDate d01 = LocalDate.now();
		System.out.println(d01.toString());
		
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println(d02);
		
		Instant d03 = Instant.now();
		System.out.println(d03);
		
		LocalDate d04 = LocalDate.parse("2024-07-20");
		System.out.println(d04);
		
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); // Converte uma string para LocalDateTime
		System.out.println(d05);
		
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		System.out.println(d06);
	
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		System.out.println(d07);
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		System.out.println(d08);
		
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		System.out.println(d09);
		
		LocalDate d10 = LocalDate.of(2022,7,20);
		System.out.println(d10);
		
		LocalDateTime d11 = LocalDateTime.of(2022, 7,20,1,30);
		System.out.println(d11);
		
		System.out.println("----------------------");
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		// Maneiras diferentes de formatar
		System.out.println(d04.format(fmt3));
		System.out.println(fmt1.format(d04));
		System.out.println(d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println(d05.format(fmt4));
		
		// Converter Datas do tipo instant
		DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		System.out.println(fmt5.format(d06));
	
		DateTimeFormatter fmt6 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt7 = DateTimeFormatter.ISO_INSTANT;
		System.out.println(d05.format(fmt6));
		
		System.out.println(fmt7.format(d06));
		
		System.out.println("-------------------------");
		// Pegar dados especificos de datas 
		
		/* for (String s : ZoneId.getAvailableZoneIds()){
			System.out.println(s);
		} */
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println(r1);
		System.out.println(r2);
		
		System.out.println("Dia d04 = " + d04.getDayOfMonth());
		System.out.println("Mes d04 = " + d04.getMonthValue());
		System.out.println("Ano d04 = " + d04.getYear());
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("Dia d04 = " + r3.getHour());
		System.out.println("Dia d04 = " + r3.getMinute());
		
		System.out.println("------------------------------------");
		// Soma e subtração de datas
		
		// Tambem funciona com o LocalDateTime e com o Instant]
		// Minus = Menos , Plus = Mais
		
		LocalDate pastWeek = d04.minusDays(7);
		LocalDate nextWeek = d04.plusDays(7);
		LocalDate nextYear = d04.plusYears(7);
		
		System.out.println(pastWeek);
		System.out.println(nextWeek);
		System.out.println(nextYear);
		
		
		LocalDateTime pastWeekDateTime = d05.minusDays(7);
		@SuppressWarnings("unused")
		LocalDateTime nextWeekDateTime = d05.plusDays(7);
		
		System.out.println(d06.minus(7, ChronoUnit.DAYS));
		System.out.println(d06.plus(7, ChronoUnit.DAYS));
		
		System.out.println("----------------------------");
		// Tempo entre datas
		
		Duration t1 = Duration.between(pastWeekDateTime, d05);
		Duration t2 = Duration.between(pastWeek.atStartOfDay(), d04.atStartOfDay());
		
		System.out.println(t1.toDays());
		System.out.println(t2.toDays());
	}	

}
