package e_8_contar_caracter;

import java.util.Scanner;

public class Contar_caracter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner (System.in);
		String entrada="";
		
		System.out.println("Frase a analizar");
		char[]frase=leerChars();
		System.out.println("Que caracter desea contabilizar");
		entrada=teclado.next();
		char caracter=(char) entrada.charAt(0);
		System.out.println("El caraacter " + caracter +" se repite "+contarCaracter(frase, caracter) + " veces.");	
	}
	
	public static int contarCaracter(char[]frase, char letra){
		int cont=0;
		for (int i=0;i<frase.length;i++){
			if (frase[i]==letra){
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
