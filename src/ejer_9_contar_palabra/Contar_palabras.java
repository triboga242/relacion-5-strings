package ejer_9_contar_palabra;

import java.util.Scanner;

public class Contar_palabras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = leerFrase();

		String palabra = leerFrase();

		System.out.println(contarPalabras(palabra, frase));
	}

	public static int contarPalabras(String palabra, String frase) {
		int cont = 0;
		while (frase.indexOf(palabra) > -1) {

			frase = frase.substring(frase.indexOf(palabra) + palabra.length(), frase.length());
			cont++;
		}

		return cont;
	}

	public static String leerFrase() {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String entrada = "";

		System.out.println("¿Que frase desea analizar?");
		entrada = teclado.nextLine();

		return entrada;
	}
}
