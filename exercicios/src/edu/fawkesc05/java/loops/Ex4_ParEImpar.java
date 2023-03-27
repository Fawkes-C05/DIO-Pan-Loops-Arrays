package edu.fawkesc05.java.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Ex4_ParEImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int quantidadeNumeros;
		int quantPares = 0;
		int quantImpares = 0;
		int numero;
		int count = 0;
		
		System.out.println("Quantidade de números: ");
		quantidadeNumeros = scan.nextInt();
		
		do {
			System.out.println("Digite um número: ");
			numero = scan.nextInt();
			
			if (numero % 2 == 0) {
				quantPares += 1;
			} else {
				quantImpares += 1;
			}
			
			count++;
			
		} while (count < quantidadeNumeros);
		
		System.out.println("Quantidade de números pares: " + quantPares);
		System.out.println("Quantidade de números ímpares: " + quantImpares);
	}

}
