package Orientaçãoaobjetos;

import java.util.Scanner;

public class HeartRateTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Informe seu nome:");
		String nome = input.nextLine();

		System.out.println("Informe seu sobrenome:");
		String sobrenome = input.nextLine();

		System.out.println("Informe sua idade:");
		int datadenascimento = input.nextInt();

		HeartRate pessoa1 = new HeartRate(nome,sobrenome,datadenascimento);

		System.out.printf( " %s %s idade %d\n",pessoa1.getNome(), pessoa1.getSobrenome(), pessoa1.getDatadenascimento());

		System.out.printf(
				"Frequencia cardiaca Maxima e : %d BPM ( Batimentos por minuto )\n", pessoa1.frequenciacardiacaMaxima() );

		System.out.println("Frequencia cardiaca alvo " );
		pessoa1.frequenciacardiacaAlvo();
	}

}
