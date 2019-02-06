package Orientaçãoaobjetos;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Account account = new Account();

		System.out.println("Informe o seu nome:");
		String nome = input.nextLine();
		account.setNome(nome);

		System.out.println("Nome:" + account.getNome());
		;

	}

}
