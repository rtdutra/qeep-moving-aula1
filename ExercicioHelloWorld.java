package br.com.qm.aulaUm;

import java.util.Scanner;

public class ExercicioHelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Ol� querido usu�rio, digite um n�mero ");
		Scanner teclado = new Scanner(System.in);
		
		int inteiroLido = teclado.nextInt();
		
		System.out.printf("\nO n�mero lido foi: %d", inteiroLido);
		
		teclado.close();
	
	}

}
