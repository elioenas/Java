package Inicio;
import java.util.Scanner;

public class Adicao {

	public static void main(String[] args) {

		int numero1;// primeiro numero
		int numero2;// segundo numero
		int somatorio;// soma dos numeros

		Scanner input = new Scanner(System.in);

		System.out.println("Digite o primeiro numero:"); // lê o primeiro numero
		numero1 = input.nextInt();

		System.out.println("Digite o segundo numero:"); // lê o segundo numero
		numero2 = input.nextInt();

		somatorio = numero1 + numero2; // funcao pra somar

		System.out.println("Somatorio:" + somatorio); // exibe a soma

	}

}
