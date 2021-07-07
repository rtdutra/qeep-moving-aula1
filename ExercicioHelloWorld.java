package br.com.qm.aulaUm;

import java.util.Scanner;

public class ExercicioHelloWorld {

	public static void main(String[] args) {
		
		System.out.println("Olá querido usuário, digite um número ");
		Scanner teclado = new Scanner(System.in);
		
		int inteiroLido = teclado.nextInt();
		
		System.out.printf("\nO número lido foi: %d", inteiroLido);
		
		teclado.close();
	
	}

}
