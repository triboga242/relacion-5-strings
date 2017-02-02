package e_4_encuentra_caracter;

import java.util.Scanner;

public class Encuentra_caracter {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String entrada = "";

		System.out.println("Frase a analizar");
		char[] frase = leerChars();
		System.out.println("Que caracter desea contabilizar");
		entrada = teclado.next();
		char caracter = (char) entrada.charAt(0);
		if (encuentraCaracter(frase, caracter) > 0) {
			System.out.println("El caracter " + caracter + " si se encuentra en la frase.");
		} else {
			System.out.println("No se encuentra");
		}
	}
	public static int encuentraCaracter(char[] frase, char letra) {
		int cont = 0;
		for (int i = 0; i < frase.length; i++) {
			if (frase[i] == letra) {
				cont++;
			}
		}
		return cont;
	}

	public static char[] leerChars() {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String entrada = "";

		entrada = teclado.nextLine();
		char[] frase2 = entrada.toCharArray();
		return frase2;
	}
}