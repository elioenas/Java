package ClassesAbstratas;

public class FuncionarioTest {

	public static void main(String[] args) {

		Gerente gerente = new Gerente("Maria", "12675-8", 3000);
		Vendedor vendedor = new Vendedor("Marcos", "22795-8", 3000, 5000);
		gerente.calcularsalario();
		vendedor.calcularsalario();
		System.out.println(gerente);
		System.out.println(vendedor);
	}
}
