package Lista02_270122;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/*2-	Fa�a um programa que entre com tr�s 
		 * n�meros e coloque em ordem crescente.*/ 
		Scanner entrada = new Scanner (System.in);
		
		int n1,n2,n3, ordem1=0, ordem2=0, ordem3=0;
		
		System.out.println("Digite um n�mero: ");
		n1 = entrada.nextInt();
		
		System.out.println("Digite um n�mero: ");
		n2 = entrada.nextInt();
		
		System.out.println("Digite um n�mero: ");
		n3 = entrada.nextInt();
		
		
		if (n1 > n3) {
		n1 = ordem1;
		}
		else if (n1 < n2) {
		n1 = ordem3;
		}
		else if (n2 < n3){		
		n3 = ordem2;
		}
		else if (n2 < n3) {
		n2 = ordem2;
		}
		else if (n3 < n1 ){
		n3 = ordem1;
		}
		else  {
						
		}
				
		{
			System.out.println("a ordem �: " + ordem1);
			System.out.println("a ordem �: " + ordem2);
			System.out.println("a ordem �: " + ordem3);
		}
}
		
	}
