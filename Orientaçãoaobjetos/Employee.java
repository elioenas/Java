package Orientaçãoaobjetos;

import java.util.Scanner;

public class Employee {

	Scanner input = new Scanner(System.in);

	String nome;
	String sobrenome;
	Double salario;

	public Employee(String nom, String sobren, Double salar) {
		super();
		this.nome = nom;
		this.sobrenome = sobren;
		this.salario = salar;
	}

	public String getNome() {
		return nome;
	}

	public void setNome() {

		System.out.println("Informe o nome do funcionario:");
		String nom = input.nextLine();
		nome = nom;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome() {
		System.out.println("Informe o sobrenome do funcionario:");
		String sobren = input.nextLine();
		sobrenome = sobren;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario() {
		System.out.println("Informe o seu salario mensal:");
		Double salar = input.nextDouble();

		if (salar == 0) {

			salar = 0.0;

		} else {

			salario = salar;

			System.out.println("Salario anual R$ " + salario * 12);
			System.out.println("SaLario anual corrigido em 10% e R$ " + (salario * 1.10));
		}
	}

}
