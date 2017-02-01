package e_11_buscaCadena_cambia_primera;

import java.util.Scanner;

public class E_11 {

	public static void main(String[] args) {

		System.out.println("¿Que frase desea analizar?");
		String frase = leerFrase();
		System.out.println("¿Que palabra desea cambiar?");
		String palabra = leerFrase();	 
		String letra=palabra.substring(0);
		String asterisco = "*";

		System.out.println(sustituyePalabra(palabra, letra, frase, asterisco));
	}

	public static String sustituyePalabra(String palabra1, String letra, String frase, String reemplazo) {

		String nueva = "";
		nueva = frase.replaceAll(letra, reemplazo);
		return nueva;
	}

	public static String leerFrase() {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String entrada = "";

		entrada = teclado.nextLine();

		return entrada;
	}
}
