package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("bom");
		System.out.print(" dia!\n");
		
		System.out.println("bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d",
				1, 2, 3, 4);
		System.out.printf("Salario: %.1f%n", 1234.4567);
		System.out.printf("Nome: %s%n", "Joao");
		
		//int a = 3;
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
//		System.out.println("\n\nNome: " + nome);
		
		System.out.print("Digite o seu sobrenome: ");
		String sobreNome = entrada.nextLine();
		
//		System.out.println("\n\nNome: " + nome + " " + sobreNome);
		
		System.out.println("Digite sua idade:");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n",
				nome, sobreNome, idade);
		
		entrada.close();
		
		
	}

}
