package br.com.qm.aulaUm;

import java.util.Scanner;

public class ExercicioQuatro {
	
	// 4. Leia um n�mero real e imprima o resultado do quadrado desse n�mero.
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## Calculadora de Quadrados ##");
		System.out.println("digite um n�mero ");
		float numeroLido = teclado.nextFloat();
		
		float quadrado = numeroLido * numeroLido;
		System.out.printf("O quadrado de %.2f � %.2f", numeroLido, quadrado);
		
		teclado.close();
		
				
		
	}

}
