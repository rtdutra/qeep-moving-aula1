package br.com.qm.aulaUm;

import java.util.Scanner;

public class ExercicioSeis {
	
	// 6. Leia o tamanho do lado de um quadrado e imprima como resultado 
	// a sua �rea.
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("## Calculador de �rea de um Quadrado");
		System.out.println("Digite o tamanho do lado: ");
		int lado = teclado.nextInt();
		int area = lado * lado;
		
		System.out.printf("A �rea do quadrado � %d", area);
		teclado.close();
	

	}

}
