package edu.fawkesc05.java.loops;

import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class Ex2_Nota {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int nota;
		
		System.out.println("Digite uma nota válida: ");
		nota = scan.nextInt();
		
		while(nota < 0 | nota > 10) {
			System.out.println("Nota inválida! Informa uma nota de 0 à 10...");
			System.out.println("Digite uma nota válida: ");
			nota = scan.nextInt();
		}
		
		System.out.println("Nota: " + nota);
		
	}

}
