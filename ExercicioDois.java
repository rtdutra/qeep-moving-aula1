package br.com.qm.aulaUm;

import java.util.Scanner;

public class ExercicioDois {
	
	// 2. Fa�a um programa que leia um n�mero real e o imprima.
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um n�mero real: ");
		float realLido = teclado.nextFloat();
		
		System.out.printf("O n�mero lido foi %.2f", realLido);
		
		teclado.close();
		

	}

}
