
//1. Escribe	 la	 función	 “NúmeroEspacios”	 a	 la	 que	 le	 pasamos	 una	
//cadena	 y	 nos	 devuelve	el	 número	 de	espacios	 que	 contiene	esa	
//cadena	(tanto	al	principio	y	al	final	como	intercalados).	


package e_1_numeroEspacios;

import java.util.Scanner;

public class E_1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char []caracteres;
		char caracter=' ';
		String entrada;
		@SuppressWarnings("resource")
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Introduzca la frase a analizar");
		entrada=teclado.nextLine();
		caracteres=entrada.toCharArray();
		
		//System.out.println("¿Que letra o caracter desea contabilizar?");
		//entrada=teclado.nextLine();
		//caracter=entrada.nex;
		
		imprimeArray(caracteres);
		System.out.println(caracter);
		System.out.println(cuentaLetras(caracteres, caracter));
	}
	public static int cuentaLetras (char []array, char letra){
		int cont=0;
		for (int i=0; i< array.length;i++){
			if(array[i]==letra){
				cont++;
			}
		}
		
		return cont;
	}
	public static void imprimeArray(char []array){
		int f;
		System.out.print("[");
		for(f=0;f<array.length-1;f++){
			System.out.print(array[f] + ", ");
		}System.out.println(array[f] + "]");
	}

}
