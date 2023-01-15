package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	Data(){
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970);
		}
		//Variavel local nao tem valor default
//		int a; 
//		System.out.println(a);
		
		// byte, short, int, long -> 0
		// float, double -> 0.0
		// boolean -> false
		// char -> '\u0000'
		// Objetos -> Null
	
	
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, this.dia, mes, ano);
	}

	void imprimirDataFormata() {
//		System.out.printf("%d/%d/%d\n", dia, mes, ano);
		System.out.println(obterDataFormatada());
	}
	
}
