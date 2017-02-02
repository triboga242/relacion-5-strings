package e_5_repite_caracter;

import java.util.Scanner;

public class Repite_caracter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Caracter:");
		String entrada=teclado.next();
		System.out.println("Veces:");
		char caracter=(char) entrada.charAt(0);
		
		int veces=teclado.nextInt();
		
		for (int i=0;i<veces;i++){
			System.out.print(caracter + " ");
		}
	}

}
