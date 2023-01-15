package fundamentos.Casting;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Primeiro numero: ");
		String a = entrada.nextLine().replace(",", ".");
		
		System.out.print("\nSegundo numero: ");
		String b = entrada.nextLine().replace(",", ".");
		
		System.out.print("\nTerceiro numero: ");
		String c = entrada.nextLine().replace(",", ".");
	
		
		double salario1 = Double.parseDouble(a);
		double salario2 = Double.parseDouble(b);
		double salario3 = Double.parseDouble(c);
		
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.println("A media dos salarios e: " + media);
		
		entrada.close();
		
	}
	
}
