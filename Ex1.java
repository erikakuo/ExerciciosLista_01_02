package Lista02_270122;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*1-	Fa�a um programa que receba tr�s 
		 * n�meros inteiros e diga qual deles � o maior.*/
		Scanner entrada = new Scanner (System.in);
		
		int n1,n2,n3, maior=0;
		
		System.out.println("Digite um n�mero: ");
		n1 = entrada.nextInt();
		
		System.out.println("\nDigite um n�mero: ");
		n2 = entrada.nextInt();
		
		System.out.println("Digite um n�mero: ");
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
