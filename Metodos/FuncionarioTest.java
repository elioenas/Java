package Metodos;

public class FuncionarioTest {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		// introduzindo valores
		funcionario.emitir("Monteiro Lobato", "171.202.332-45", 3700, "23456-7");
		// funcionario.setNome("Monteiro Lobato");
		// funcionario.setCpf("171.202.332-45");
		// funcionario.setSalario(3700);
		funcionario.imprimir();
	}
}
