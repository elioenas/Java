package InstrucoesdeControle;

import java.util.Scanner;

public class TestCrescimentoPopulacional {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Informe o ano atual:");
		int ano = input.nextInt();

		System.out.println("Informe a populacao mundial atualmente:");
		long popmundial = input.nextLong();

		CrescimentoPopulacional pop = new CrescimentoPopulacional(ano, popmundial);

		// vai exibira populacao muundial nos proximos 75 anos
		for (int i = 0; i <= 74; i++) {
			System.out.println("Ano" + "," + "Habitantes");
			System.out.println(i + pop.getAno() + "," + pop.populmundial());
		}

	}
}
