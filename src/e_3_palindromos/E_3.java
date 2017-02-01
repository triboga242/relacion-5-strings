//3. Escribe	 la	 función	 “EsPalindromo”	 a	 la	 que	 le	 pasamos	 una	
//cadena	 y	 nos	 dice	 si	 la	 cadena	 es	 un	 palíndromo	 (true)	 o	 no	
//(false).	Un	palíndromo	es	una	palabra	o	 frase	que	se	lee	igual	al	
//revés	que	al	derecho.	

package e_3_palindromos;

import java.util.Scanner;

public class E_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String entrada = "";

		System.out.println("¿Que frase desea someter al palindromotizador?");
		entrada = teclado.nextLine();
		char[] frase = entrada.toCharArray();
		
		imprimeArray(frase);
		
		frase=quitarEspacios(frase);
		imprimeArray (frase);
		
		System.out.println(palindromiza(frase));

	}

	public static char[] quitarEspacios(char[] array) {
		char[] array2 = null;
		int cont = 0;
		int cont2 = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == ' ') {
				cont++;
			}
		}
		array2 = new char[array.length - cont];

		for (int i = 0; i < array.length; i++) {
			if (array[i] == ' ') {
			} else {
				array2[cont2] = array[i];
				cont2++;
			}
		}
		return array2;
	}

	public static boolean palindromiza(char[] array) {
		boolean esPali = false;
		char[] aux = new char[array.length];
		int j = 0;
		int cont = 0;
		for (int i = array.length - 1; i >= 0; i--) {
			aux[j] = array[i];
			j++;
		}
		// if (array.equals(aux)) {------------------PQ NO FUNCIONA?????
		for (int i = 0; i < array.length; i++)
			if (array[i] == aux[i]) {
				cont++;
			}
		if (cont == array.length) {
			esPali = true;
		}

		imprimeArray(aux);
		return esPali;
	}

	public static void imprimeArray(char[] array) {
		int f;
		System.out.print("[");
		for (f = 0; f < array.length - 1; f++) {
			System.out.print(array[f] + " ");
		}
		System.out.println(array[f] + "]");
	}
}
