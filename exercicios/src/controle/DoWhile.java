package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		// if(...) sentenca; ou ()
		// while(...) sentenca; ou {}
		// for (...;...;...) sentenca; ou {}
		// do sentenca; ou {} while(...);

		Scanner entrada = new Scanner(System.in);

		String texto = "por favor";

		do {
			System.out.println("Voce precisa falar " 
					+ "\nas palavras magicas...");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
		} while (!texto.equalsIgnoreCase("por favor"));

		System.out.println("Obrigado");
		entrada.close();
	}
}
