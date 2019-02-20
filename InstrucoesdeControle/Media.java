package InstrucoesdeControle;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Double nota1, nota2, nota3, media;

		System.out.println("informe a primeira nota");
		nota1 = new Scanner(System.in).nextDouble();

		System.out.println("informe a segunda nota");
		nota2 = new Scanner(System.in).nextDouble();

		System.out.println("informe a terceira nota");
		nota3 = new Scanner(System.in).nextDouble();
		media = (nota1 + nota2 + nota3) / 3;

		if (media >= 7) {
			System.out.println("Aprovado com média " + media);
		} else if (media >= 5) {
			System.out.printf("Recuperacao com media " + media);
		} else {
			System.out.printf("Reprovado com media " + media);
		}

	}
}
