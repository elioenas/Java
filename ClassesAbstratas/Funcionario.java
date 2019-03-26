package ClassesAbstratas;

public abstract class Funcionario {

	/*
	 * abstract nao permite que a classe seja instanciada
	 */

	protected String nome;
	protected String cli;
	protected double salario;

	// construtor vazio
	public Funcionario() {

	}

	public Funcionario(String nome, String cli, double salario) {
		this.nome = nome;
		this.cli = cli;
		this.salario = salario;
	}

	// metodo abstrato nao tem codigo e seus metodos tem que
	// ser sobrescritos nas outras classes
	public abstract void calcularsalario();

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cli=" + cli + ", salario=" + salario + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCli() {
		return cli;
	}

	public void setCli(String cli) {
		this.cli = cli;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
