package lista01_270122;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/*2-	Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/ 
		
		Scanner leia = new Scanner (System.in);
		int num;
		int contador1=0, contador2=0;
		
				
		for(int i = 0; i<10; i++) {
			System.out.println("Digite um numero: ");
			num = leia.nextInt();
	
			if(num %2 == 0) {
			contador1++;
			}
			else {
			contador2++;
				
			}
			
			
		}
		System.out.println("Impares: " + contador2);
		System.out.println("Pares: " + contador1);
	}
	
}