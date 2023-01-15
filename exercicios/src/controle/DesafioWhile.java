package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// MINHA SOLUCAO
//		int notasValidas = 0;
//		Double nota;
//		double total = 0.0;
//
//		do {
//			System.out.print("Insirir nota: ");
//			nota = entrada.nextDouble();
//			if (nota <= 10 && nota >= 0) {
//				total = total + nota;
//				notasValidas++;
//			} else if (nota > 10 || nota < -1) {
//				System.out.println("Nota invalida!");
//			}
//		} while (!nota.equals(-1.0));
//		double media = total / notasValidas;
//		System.out.println("Media: " + media);

		// SOLUCAO DO PROFESSOR.
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;

		while (nota != -1) {
			System.out.println("Informe a nota: (ou -1 p/ sair): ");
			nota = entrada.nextDouble();

			if (nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;
			} else if (nota != -1) {
				System.out.println("Nota invalida");
			}

		}

		// Calcular media:
		double media = total / quantidadeDeNotas;
		System.out.println("Media: " + media);

		entrada.close();
	}
}
