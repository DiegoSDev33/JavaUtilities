package Vetores;

import java.util.Arrays;

public class programVetores {

	public static void main(String[] args) {
	
		// FORMA DE LISTA DE INT
		
		int[] numeros = new int [5];	// determinando o tamanho do array - indicies de 0 a 4
		
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		
		//System.out.println(numeros); [I@27f674d - endereco de memoria
		
		for (int i =0 ; i< numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		System.out.println();
		
		// FORMA DE LISTA EM STRING
		
		String[] letras = new String [5];	// determinando o tamanho do array - indicies de 0 a 4
		
		letras[0] = "Diego";
		letras[1] = "Juliana";
		letras[2] = "Tiago";
		letras[3] = "Giovanna";
		letras[4] = "Ryan";
		
		//System.out.println(numeros); [I@27f674d - endereco de memoria
		
		for (int i =0 ; i< letras.length; i++) {
			System.out.println(letras[i]);
		}
		
		System.out.println();
		
		// FORMA DE LISTA EM STRING ATRIBUINDO OS VALORES DENTRO DE CHAVES
		
		String[] valores = {"banana", "melancia", "maca", "limao", "pera"};
		for (int i =0 ; i< valores.length; i++) {
			System.out.println(valores[i]);
		}
		
		
		//outra forma de printar os valores que estao dentro do array
		System.out.println(Arrays.toString(letras));
		
		
		
		
		int [] n = {5,10,50,12,2};
		
		int maior = n[0];
		int menor = n[0];
		int media = 0;
		
		for(int i =0; i < n.length;i++) {
			
			if(n[i] > maior) {
				maior = n[i];
			}
			
			if(n[i]< menor) {
				menor=n[i];
			}
			
			media += n[i];
			
			
		}
		
		System.out.println(" valor maior " + maior);
		System.out.println(" valor menor " + menor);
		System.out.println(" valor media " + (media/n.length));
		
		
		
		
		
		
		
	}

}
