package Heranca;

public class Test {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		Endereco endereco = new Endereco();
		Funcionario funcionario = new Funcionario();
		pessoa.setNome("Michael");
		pessoa.setCpf("2345678");
		endereco.setBairro("Mangabeira");
		endereco.setRua(" Rua Joao belo vieira");
		pessoa.setEndereco(endereco);
		pessoa.imprimir();
		System.out.println("############################################");
		funcionario.setNome("Joao");
		funcionario.setCpf("234589");
		funcionario.setSalario(2000);
		funcionario.setEndereco(endereco);
                funcionario.imprimir();
	}

}
