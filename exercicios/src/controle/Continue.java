package controle;

public class Continue {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				continue; // interrompe a atual iteracao do for e pula para a proxima.
			}
			System.out.println(i);
		}
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 5)continue; // interrompe a atual iteracao do for e pula para a proxima.
			System.out.println(i);
		}
	}
}
