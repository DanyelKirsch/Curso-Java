package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		// Domingo -> 1
		// 
		// quarta -> 4
		// terca - > 3 
		//
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dia semana: ");
		String dia = entrada.next();
		dia = dia.toUpperCase();
		
		String domingo = "DOMINGO";
		String segunda = "SEGUNDA";
		String terca = "TERCA";
		String quarta = "QUARTA";
		String quinta = "QUINTA";
		String sexta = "SEXTA";
		String sabado = "SABADO";
		
		if(dia.equals(domingo)) {
			System.out.println("1");
		} else if (dia.equals(segunda)) {
			System.out.println("2");
		} else if (dia.equals(terca)) {
			System.out.println("3");
		} else if (dia.equals(quarta)) {
			System.out.println("4");
		} else if (dia.equals(quinta)) {
			System.out.println("5");
		} else if (dia.equals(sexta)) {
			System.out.println("6");
		} else if (dia.equals(sabado)) {
			System.out.println("7");
		} else {
			System.out.println("Valor invalido.");
		}
		
		
		// Other solutions: 
		
//		if("domingo".equalsIgnoreCase(dia)) {
//			System.out.println(1);
//		}
//		
//		if(dia.equalsIgnoreCase("domingo")) {
//			System.out.println(1);
//		}
		
//		if ("domingo".equals(dia.toLowerCase())) {
//			System.out.println(1);
//		}
		
		entrada.close();
		
	}
}
