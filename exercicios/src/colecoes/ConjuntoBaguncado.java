package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
							// Set nao aceita tipos primitivos.
		conjunto.add(1.2); // Cast double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); // int -> Integer
		conjunto.add(2); 
		conjunto.add('x'); // char -> Character
		
		
		System.out.println("Tamanho e: " + conjunto.size());
		
		conjunto.add("Teste");
		System.out.println("Tamanho e: " + conjunto.size());
		
		
		// Nao existe o elemento teste no set - return false
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		
		System.out.println("Tamanho e: " + conjunto.size());
		
		
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains("test"));
		
		
		HashSet nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
//		conjunto.addAll(nums); // Uniao entre dois conjuntos.
		conjunto.retainAll(nums); // Deixa somente os elementos iguais entre os dois sets
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);

		
	}
}
