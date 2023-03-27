package edu.fawkesc05.java.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex3_MaiorEMedia {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double numero;
		double maior = 0;
		double soma = 0;
		double media;
		
		int count = 0;
		
		do {
			System.out.println("Informe um número: ");
			numero = scan.nextDouble();
			
			soma += numero;
			
			if (numero > maior) {
				maior = numero;
			}
			
			count++;
		} while (count < 5);
		
		media = soma / 5;
		
		System.out.println("Maior número: " + maior);
		System.out.println("Média: " + media);
	}

}
