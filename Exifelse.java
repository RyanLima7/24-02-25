package src;

import java.util.Scanner;

public class Exifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Código para avaliação de notas
		
		Scanner sc = new Scanner(System.in);

		Double nota;

		System.out.println("Digite nota ");

		nota = sc.nextDouble();

		if (nota > 10) {

			System.out.println(" Você está aprovado");

		} else if (nota >= 7 && nota < 10) {
			System.out.println(" Você está aprovado");

		} else {

			System.out.println("Você está Reprovado");

		}}}
