package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Valor 1: ");
		double valor1 = entrada.nextDouble();
		
		System.out.print("valor 2: ");
		double valor2 = entrada.nextDouble();
		
		System.out.println("Qual operacao (+ - * / %): ");
		String operacao = entrada.next();
		
		//LOGICA
		double resultado = "+".equals(operacao) ? valor1 + valor2 : 0; 
		resultado = "-".equals(operacao) ? valor1 - valor2 : resultado;
		resultado = "/".equals(operacao) ? valor1 / valor2 : resultado;
		resultado = "%".equals(operacao) ? valor1 % valor2 : resultado;
		resultado = "*".equals(operacao) ? valor1 * valor2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", valor1, operacao, valor2, resultado);
		
		entrada.close();

	}
}