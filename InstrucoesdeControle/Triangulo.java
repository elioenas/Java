package InstrucoesdeControle;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {

		//variaveis
		int a;
		int b;
		int c;

		//lendo  entrada
		Scanner input = new Scanner(System.in);

		System.out.println("insira um valor para o lado " + "A" + " do triangulo:");
		a = input.nextInt();

		System.out.println("insira um valor para o lado " + "B" + " do triangulo:");
		b = input.nextInt();

		System.out.println("insira um valor para o lado " + "C" + " do triangulo:");
		c = input.nextInt();

		while (a <= 0) {

			System.out.println("O valor inserido e negativo nao se  pode criar um triangulo");

			System.out.println("insira um valor para o lado " + "A" + " do triangulo:");
			a = input.nextInt();
		}

		while (b <= 0) {

			System.out.println("O valor inserido e negativo nao se  pode criar um triangulo");

			System.out.println("insira um valor para o lado " + "B" + " do triangulo:");
			b = input.nextInt();
		}

		while (c <= 0) {

			System.out.println("O valor inserido e negativo nao se  pode criar um triangulo");

			System.out.println("insira um valor para o lado " + "C" + " do triangulo:");
			c = input.nextInt();
		}
		// se a soma dos dois lados for maior que o terceiro pode se criar um triangulo
		if (a + b > c) {
			System.out.println("os lados " + a + "," + b + "," + c + " podem representar os lados de um triangulo ");
		} else {

			System.out
					.println("os lados " + a + "," + b + "," + c + " nao podem representar os lados de um triangulo ");
		}
	}
}