package e_7_quitar_espacios;

import java.util.Scanner;

public class desespaciador {

	public static void main(String[] args) {
		
		String entrada = "";
		
		System.out.println("¿Que frase desea desespaciar?");
		imprimeArray(desespaciar(leerChars(entrada)));
		
	}
		public static char[] leerChars(String frase){
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String entrada = "";
		
		entrada = teclado.nextLine();
		char[] frase2 = entrada.toCharArray();
		return frase2;
	}
	public static char[] desespaciar(char[] array) {
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
	public static void imprimeArray(char[] array) {
		int f;
		System.out.print("  --");
		for (f = 0; f < array.length - 1; f++) {
			System.out.print(array[f]);
		}
		System.out.println(array[f] + "--");
	}
}
