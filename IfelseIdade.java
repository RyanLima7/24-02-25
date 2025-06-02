package src;

import java.util.Scanner;

public class IfelseIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Código para ver a sua idade e declarar se é um idoso ou criança.

		Scanner sc = new Scanner(System.in);

		int idade;

		System.out.println("Digite sua idade");

		idade = sc.nextInt();

		if (idade > 59) {

			System.out.println(" Ele é um idoso");

		} else if (idade >= 18 && idade < 60) {
			System.out.println("é adulto");

		} else {

			System.out.println(" É criança");
		}
	}
}
