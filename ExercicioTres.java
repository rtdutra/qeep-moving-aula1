package br.com.qm.aulaUm;

import java.util.Scanner;

public class ExercicioTres {
	
	// 3. Pe�a ao usu�rio para digitar tr�s valores inteiros e imprima a
	// soma deles.

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## SOMA DE TR�S N�MEROS ##");
		System.err.println("Digite Tr�s valores e eu vou imprimir a soma deles");
		
		System.out.println("Digite o primeiro n�mero ");
		int primeiroLido = teclado.nextInt();
		
		System.out.println("Digite o segundo n�mero ");
		int segundoLido = teclado.nextInt();
		
		System.out.println("Digite o terceiro n�mero ");
		int terceiroLido = teclado.nextInt();
		
		int soma = primeiroLido + segundoLido +terceiroLido;
		System.out.printf("A soma dos n�meros lidos � %d", soma);
		
		teclado.close();
	}

}
