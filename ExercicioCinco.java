package br.com.qm.aulaUm;

import java.util.Scanner;

public class ExercicioCinco {
	
	// 5. Leia um numero real e imprima a quinta parte deste n�mero.
    public static void main(String[] args) {
    	
    	Scanner teclado = new Scanner(System.in);
    	System.out.println("## Divis�o ##");
    	System.out.println("Digite um n�mero real");
    	float numeroLido = teclado.nextFloat();
    	
    	float quintaParte = numeroLido / 5F;
    	
    	System.out.printf("A quinta parte de %.2f � %,2f", numeroLido, quintaParte);
    	
    	teclado.close();
    	
	}

}
