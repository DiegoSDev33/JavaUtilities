package Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class program {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		System.out.println("Imprimindo a data de hoje: " + today);
		System.out.println("Imprimindo o dia de hoje: " + today.getDayOfWeek());
		System.out.println("Imprimindo o ano que estamos hoje:  " + today.getYear());
		System.out.println("Imprimindo o mes que estamos: " + today.getDayOfMonth());
		
		String nome = "Diego";
		
		Locale brasil = new Locale("pt", "BR");
		
		System.out.println("Imprimindo dia de hoje no formato Brasil: "+today.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
		
		String diaSemana = today.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
		String saudacao;
		
		LocalDateTime agora = LocalDateTime.now();
		
		if(agora.getHour() >= 0 && agora.getHour() <12) {
			saudacao = "Bom dia";
		}else if(agora.getHour() >=12 && agora.getHour() <18) {
			saudacao = "Boa Tarde";
		}else if(agora.getHour() >= 18 && agora.getHour() < 24){
			saudacao = "Boa Noite";
		}else {
			saudacao = "Ola";
		}
		
		System.out.printf("Ola, %s. Hoje e %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
	}

}
