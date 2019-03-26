package ClassesAbstratas;

public class Gerente extends Funcionario {

	public Gerente() {

	}

	public Gerente(String nome, String cli, double salario) {
		this.nome = nome;
		this.cli = cli;
		this.salario = salario;
	}

	public void calcularsalario() {

		this.salario = salario + salario * 0.2;
	}
}
