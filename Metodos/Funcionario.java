package Metodos;

public class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	private String rg;

	// metodo emitir
	public void emitir(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	// sobrecarga do metodo emitir
	public void emitir(String nome, String cpf, double salario, String rg) {
		 /** para nao ficar codigo duplicados do emitir antes da sobrecarga **/
		emitir(nome,cpf,salario);
		 //ou
		//this.nome = nome;
		//this.cpf = cpf;
		//this.salario = salario;
		this.rg = rg;
	}

	// metodo imprimir
	public void imprimir() {
		System.out.println(this.getNome());
		System.out.println(this.getCpf());
		System.out.println(this.getSalario());
		System.out.println(this.getRg());
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
