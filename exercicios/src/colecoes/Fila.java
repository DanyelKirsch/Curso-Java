package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> Adicionam elementos na fila. 
		// Diferenca e o comportamento ocorre
		// quando a fila esta cheia!
		fila.add("Ana"); // Lancara uma excecao caso a fila esteja cheia.
		fila.offer("Bia"); // Retorna falso caso a fila esteja cheia.
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> Obter o proximo elemento
		// da fila (sem remover)
		// Diferenca e o comportamento ocorre
		// quando a fila esta vazia!
		System.out.println(fila.peek()); // retorna Null
		System.out.println(fila.peek()); // Lanca uma excecao.
		System.out.println(fila.element());
		System.out.println(fila.element());
		

		
		// Poll e Remove -> Obter o proximo elemento
		// da fila e remove!
		
		// Diferenca e o comportamento ocorre
		// quando a fila esta vazia!
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll()); // Se a fila estiver vazia retorna null
		//System.out.println(fila.remove()); // Se a fila estiver vazia retorna uma excesao
		
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...)
		
		
	}
}
