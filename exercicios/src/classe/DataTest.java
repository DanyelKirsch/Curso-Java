package classe;

public class DataTest {

	public static void main(String[] args) {
		
		Data data = new Data(24, 12, 1990);
		
		var data2 = new Data();
		
		System.out.println(data.obterDataFormatada());
		System.out.println(data2.obterDataFormatada());

		data2.imprimirDataFormata();
	}
}
