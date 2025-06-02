package projeto01;

import java.util.Scanner;

public class IfelsePositivoNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Código para ver se o número é positivo, negativo ou se é igual a zero.

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		double numero = sc.nextDouble();

		if (numero > 0) {
			System.out.println("O número é positivo.");
		} else if (numero < 0) {
			System.out.println("O número é negativo.");
		} else {
			System.out.println("O número é igual a zero.");
		}

		sc.close();
	}

}
