//2. Escribe	 la	 función	 “NumeroVocales”	 a	 la	 que	 le	 pasamos	 una	
//cadena	 y	 nos	 devuelve	 el	 número	 de	 vocales	 que	 hay	 en	 la	
//cadena.	

package e_2_numero_vocales;

import java.util.Scanner;

public class E_2 {
	final static char[] vocales = {

			'a', 'e', 'i', 'o', 'u' };

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String entrada = "";
		

		System.out.println("¿De que frase desea contar las vocales?");
		entrada = teclado.nextLine();
		char[] frase = entrada.toCharArray();
		
		imprimeArray(frase);
		System.out.println(contarVocales(frase));
	}

	public static int contarVocales(char[] array) {
		int cont = 0;
		for (int i = 0; i < array.length; i++) {	//recorre frase
			for (int j = 0; j < vocales.length; j++) {	//recorre vocales
				if (array[i] == vocales[j]) {
					cont++;
				}
			}
		}
		return cont;
	}

	public static void imprimeArray(char[] array) {
		int f;
		System.out.print("[");
		for (f = 0; f < array.length - 1; f++) {
			System.out.print(array[f] + ",");
		}
		System.out.println(array[f] + "]");
	}
}
