package arrays;

import java.util.Scanner;

public class Desafio {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas voce quer informar? ");
		int notas = entrada.nextInt();
		
		double[] arrayDeNotas = new double[notas];
		
		int count = 1;
		for (int i = 0; i < arrayDeNotas.length; i++) {
			System.out.printf("Informe a nota %d: ", count);
			arrayDeNotas[i] = entrada.nextDouble();
			count++;
		}
		
		double totalDeNotas = 0;
		for (double nota: arrayDeNotas) {
			totalDeNotas += nota;
		}
		System.out.printf("Media do Aluno: %.2f", totalDeNotas / arrayDeNotas.length);
		entrada.close();
	}
}
