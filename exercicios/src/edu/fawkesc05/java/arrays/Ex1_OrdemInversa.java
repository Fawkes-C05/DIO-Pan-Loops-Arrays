package edu.fawkesc05.java.arrays;

import java.util.Arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class Ex1_OrdemInversa {

	public static void main(String[] args) {
		int[] vetor = {10, 45, -200, 76, 3, -9};
		
		int count = (vetor.length - 1);
		
		System.out.print("Vetor Inverso: ");
		
		while (count >= 0) {
			System.out.print(vetor[count] + " ");
			count--;
		}
		
		System.out.println("\n-------------------------------------");
		
		System.out.print("Vetor: ");
		
		for (int elemento : vetor) {
			System.out.print(elemento + " ");
		}
	}

}
