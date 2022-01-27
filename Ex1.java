package Lista02_270122;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*1-	Faça um programa que receba três 
		 * números inteiros e diga qual deles é o maior.*/
		Scanner entrada = new Scanner (System.in);
		
		int n1,n2,n3, maior=0;
		
		System.out.println("Digite um número: ");
		n1 = entrada.nextInt();
		
		System.out.println("\nDigite um número: ");
		n2 = entrada.nextInt();
		
		System.out.println("Digite um número: ");
		n3 = entrada.nextInt();
		
		
		if (n1 > n2 && n1 > n3) {
		maior = n1;
		}
		else if (n1 < n2 && n2 > n3) {
			maior = n2;
		}
		else {
			
		maior = n3;
		}
				
		{
			System.out.println("O maior: " + maior);
		}
}
}
