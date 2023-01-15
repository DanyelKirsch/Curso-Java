package fundamentos;

//import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		
//		Scanner entrada = new Scanner(System.in);
		
		//byte
		Byte b = 100;
		Short s = 1000;		
		
//		Integer i = Integer.parseInt(entrada.next()); // int
		Integer i = 10000;
		Long l = 100000L;
		
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10f;
		System.out.println(f);
		
		
		Double d  = 1234.5678;
		System.out.println(d);
		
		
		// Classe Boolean
		Boolean bo = Boolean.parseBoolean("true");
		
		// Tipo primitivo
//		boolean bo = Boolean.parseBoolean("true");
		
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		
		// Char passa a ser Character
		Character c = '#'; // char
		System.out.println(c + ".....");
	}
	
}
