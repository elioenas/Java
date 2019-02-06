package Orientaçãoaobjetos;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee primeiro = new Employee("", "", 0.00);

		primeiro.setNome();
		primeiro.setSobrenome();
		primeiro.setSalario();

		primeiro.getNome();
		primeiro.getSobrenome();
		primeiro.getSalario();

	}

}
