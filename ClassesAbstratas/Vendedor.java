package ClassesAbstratas;

public class Vendedor extends Funcionario {

	private double totalvendas;

	public Vendedor() {

	}

	public Vendedor(String nome, String cli, double salario, double vendas) {
		super(nome, cli, salario);
		this.totalvendas = vendas;
	}

	@Override
	public void calcularsalario() {
		this.salario = salario + totalvendas * 0.05;
	}

	public double getVendas() {
		return totalvendas;
	}

	public void setVendas(double vendas) {
		this.totalvendas = vendas;
	}

}
