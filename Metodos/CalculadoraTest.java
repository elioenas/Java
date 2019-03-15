package Metodos;

public class CalculadoraTest {

	public static void main(String[] args) {

		// crindo o objeto
		Calculadora calculadora = new Calculadora();
		calculadora.multiplicaDoiNumeros();
		calculadora.divideDoisNumeros();
		calculadora.subtraiDoisNumeros(34, 12);
		System.out.println(calculadora.somaDoisnNumeros(2, 6));
	}
}
