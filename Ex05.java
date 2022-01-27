package lista01_270122;

import java.util.Scanner;

public class Ex05 {

			public static void main(String[] args) {
			/*Crie um programa que leia um número do teclado até que 
			 * encontre um número igual a zero. No final, 
			 * mostre a soma dos números digitados.(DO...WHILE)*/
			Scanner in = new Scanner(System.in);
			
			int numero = 0, soma = 0 ;
			
			do {
				soma = soma + numero; 
				System.out.println("Digite um numero: ");
				numero = in.nextInt();
				if (numero == 0) {
					System.out.println("Você acertou e soma é: " + soma);
				}
				else{
					System.out.println("Você errou!!");
			}	
			}while(numero !=0);
			}
}

