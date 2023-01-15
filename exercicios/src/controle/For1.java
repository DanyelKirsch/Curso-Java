package controle;

public class For1 {

	public static void main(String[] args) {
		
//		int contador = 0;
//		while( contador <= 20) {
//			System.out.printf("i = %d\n", contador);
////			contador++;
//			contador += 2;
//		}
		
		for (int contador = 0; contador <= 20; contador +=2 ) {
			System.out.printf("i = %d\n", contador);
		}
		
		// Parecido com o while, nao faz sentido.
//		int x = 2;
//		for (; x < 10;) {
//			System.out.println("x = " + x);
//			x++;
//		}
		
		// imitando um while  - Laco infinito
//		for (;true;) {
//			System.out.println("fim");
//		}
		
		
	}
}
