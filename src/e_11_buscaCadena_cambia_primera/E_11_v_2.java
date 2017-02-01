package e_11_buscaCadena_cambia_primera;

import java.util.Scanner;

public class E_11_v_2 {

	public static void main(String[] args) {
 
		Scanner teclado = new Scanner(System.in);
		String cadena1 = "";
		String subcadena = "";
		
		System.out.println("Introduceme una cadena: ");
		cadena1 = teclado.nextLine();
		System.out.println("Introduce una subcadena: ");
		subcadena = teclado.nextLine();

		System.out.println(MarcaSubCadena(cadena1, subcadena));

	}

	public static String MarcaSubCadena(String cadena1, String subcadena) {

		char arr[] = subcadena.toCharArray();

		arr[0] = '*';

		return cadena1.replaceAll(subcadena, String.valueOf(arr));
	}
}
