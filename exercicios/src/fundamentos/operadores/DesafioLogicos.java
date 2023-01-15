package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Tranalho na terca (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho = false;
		boolean trabalho2 = false;
		
		Boolean tv50 = trabalho && trabalho2;
		Boolean tv32 = trabalho ^ trabalho2;
		Boolean sorvete = trabalho || trabalho2;
		Boolean ficarEmCasa = !sorvete;
		
		System.out.print("Comprar TV 50: " + tv50 );
		System.out.println("\nComprar TV 32: " + tv32 );
		System.out.println("Tomar sorvete: " + sorvete);
		System.out.println("Ficar em casa: " + ficarEmCasa);
		
		
		
		
	}
}
