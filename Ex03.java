package Lista02_270122;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
/*3-	Fa�a um programa que receba a idade de uma 
		 * pessoa e mostre na sa�da em qual categoria ela se encontra:
�	10-14 infantil
�	15-17 juvenil
�	18-25 adulto
*/ 

		Scanner entrada = new Scanner (System.in);
		
		int idade =0;
		
		System.out.println("Digite a sua idade: ");
		idade = entrada.nextInt();
		
		if (idade>=10 && idade<=14) {
			System.out.println("10-14 infantil");
		}
		else if (idade>=15 && idade<=17) {
			System.out.println("15-17 juvenil");
		}
		else if (idade>=18 && idade<=25) {
			System.out.println("18-25 adulto");
		}
		else {
			System.out.println("n�o est� na categoria");
		}
			
		}
}
