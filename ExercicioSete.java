package br.com.qm.aulaUm;

import java.util.Scanner;

public class ExercicioSete {
	
	// 7. Leia um n�mero inteiro e imprima o seu antecessor e o 
	// seu sucessor.
	public static void main(String[] args) {

	Scanner teclado = new Scanner(System.in);
	System.out.println("## Antecessor e Sucessor ##");
	System.out.println("Digite um n�mero inteiro ");
	int numeroLido = teclado.nextInt();
	
	int antecessor = numeroLido - 1;
	int sucessor = numeroLido + 1;
	
	System.out.printf("O antecessor de %d � %d e o sucessor � %d", numeroLido,
			antecessor, sucessor);
	
	teclado.close();
	
	}

}
