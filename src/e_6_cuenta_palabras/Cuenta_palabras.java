package e_6_cuenta_palabras;

import java.util.Scanner;

public class Cuenta_palabras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String entrada = "";

		System.out.println("¿De que frase desea contar las palabras?");
		char[] frase = desespaciar(leerChars(entrada));

		System.out.println(" Hay " + contarPalabras(frase) + "palabras.");

	}

	public static char[] leerChars(String frase) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String entrada = "";

		entrada = teclado.nextLine();
		char[] frase2 = entrada.toCharArray();
		return frase2;
	}

	public static char[] desespaciar(char[] array) {

		char[] arraySalida;
		int cont = 0;
		char espacio = ' ';

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == espacio) {
				if (array[i] == array[i + 1]) {
					cont++;
				}
			}
		}
		arraySalida = new char[array.length - cont];
		cont = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] == espacio) {
				if (array[i] == array[i + 1]) {
				} else {
					arraySalida[cont] = array[i];
					cont++;
				}
			} else {
				arraySalida[cont] = array[i];
				cont++;
			}

		}
		return arraySalida;
	}

	public static int contarPalabras(char[] array) {
		int cont = 1;
		char espacio = ' ';

		for (int i = 0; i < array.length; i++) {
			if (array[i] == espacio) {
				cont++;
			}
		}
		return cont;
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