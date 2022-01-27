package Lista02_270122;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	int num;
	double raiz, potencia;
	
	System.out.println("Digite um numero inteiro: ");
		num = leia.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Par.....");
			raiz = Math.sqrt(num);
			System.out.printf("Raiz quadrada: %.2f", raiz);
		}
		else {
			System.out.println("Impar.....");
			potencia = Math.pow(num, 2);
			System.out.println("Potencia: " + potencia);
		}
		
	}

}
