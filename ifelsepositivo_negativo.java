package projeto01;

import java.util.Scanner;

public class ifelsepositivo_negativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
