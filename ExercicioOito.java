package br.com.qm.aulaUm;

import java.util.Scanner;

public class ExercicioOito {
	
	// 8. Leia um número inteiro e imprima a soma do sucessor de seu 
	// triplo com o antecessor de seu dobro.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("## Sucessor e Antecessor do Triplo ##");
		System.err.println("Digite um número inteiro");
		int numeroLido = teclado.nextInt();
		
		int sucessorDoTriplo = (numeroLido * 3) + 1;
		int antecessorDoDobro = (numeroLido * 2) - 1;
		
		int soma = sucessorDoTriplo + antecessorDoDobro;
		
		System.out.printf("A soma do sucessor do Triplo com "
				+ "o antecessor do Dobro é: %d", soma);
				
		teclado.close();
			
		
	}

}
