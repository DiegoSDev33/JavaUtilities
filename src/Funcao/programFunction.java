package Funcao;

public class programFunction {

	public static void main(String[] args) {
		
		String nomeOriginal= "Let's Code";

		saudacao(nomeOriginal); // chamando no main a funcao criada abaixo
					// todas as funcoes para serem executadas precisam ser chamadas no main
		
		
		int resultado = soma(2,4);
		System.out.println(resultado);
		
	}
		
		public static void saudacao(String nomeParametro) { // definindo um parametro para a funcao
			System.out.println("Hello, " + nomeParametro);
		
	
	}//CRIANDO UMA FUNCAO PARA CALCULAR A SOMA ATRIBUIDA NO MAIN
		public static int soma(int a, int b) {
			return a+b;
		}
		

}
