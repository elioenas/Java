package Heranca;

public class Funcionario extends Pessoa {

	// funcionario tem os mesmos atributos da
	// classe pessoa para isso usamos o extends para herdar da classe pai

	private double salario;

	// sobrescrevendo o metodo imprimir
	public void imprimir() {
		super.imprimir();
		System.out.println("Salario:" + this.salario);

	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
