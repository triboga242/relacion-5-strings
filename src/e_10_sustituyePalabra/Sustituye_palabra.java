package e_10_sustituyePalabra;

import java.util.Scanner;

public class Sustituye_palabra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase = leerFrase();

		String palabra = leerFrase();
		
		String palabra2 =leerFrase();
		
		System.out.println(sustituyePalabra(palabra, palabra2, frase));
	}
		public static String sustituyePalabra (String palabra1, String palabra2, String frase){
			
			String nueva="";
			nueva=frase.replace(palabra1, palabra2);	
			return nueva;
		}

	
	public static String leerFrase() {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		String entrada = "";

		System.out.println("¿Que frase desea analizar?");
		entrada = teclado.nextLine();

		return entrada;
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
