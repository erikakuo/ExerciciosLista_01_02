package lista01_270122;

import java.util.Scanner;

public class Ex05 {

			public static void main(String[] args) {
			/*Crie um programa que leia um n�mero do teclado at� que 
			 * encontre um n�mero igual a zero. No final, 
			 * mostre a soma dos n�meros digitados.(DO...WHILE)*/
			Scanner in = new Scanner(System.in);
			
			int numero = 0, soma = 0 ;
			
			do {
				soma = soma + numero; 
				System.out.println("Digite um numero: ");
				numero = in.nextInt();
				if (numero == 0) {
					System.out.println("Voc� acertou e soma �: " + soma);
				}
				else{
					System.out.println("Voc� errou!!");
			}	
			}while(numero !=0);
			}
}

