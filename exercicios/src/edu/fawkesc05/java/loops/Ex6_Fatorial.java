package edu.fawkesc05.java.loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

public class Ex6_Fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int multiplicacao = 1;
		
		System.out.println("Digite o número: ");
		numero = scan.nextInt();
		
		System.out.print(numero + " != ");
		
		for (int i = numero; i >= 1; i--) {
			multiplicacao *= i;
			
			if (i != 1) {
				System.out.print(i + " . ");
			} else {
				System.out.print(i + " = " + multiplicacao);
			}
		}
	}

}
