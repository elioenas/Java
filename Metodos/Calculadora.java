package Metodos;

public class Calculadora {

	// void significa que o metod e sem retorno

	public void multiplicaDoiNumeros() {

		System.out.println(5 * 5);
	}

	public void divideDoisNumeros() {
		System.out.println(6 / 6);
	}

	// agora criando metodos com parametro

	public void subtraiDoisNumeros(int num1, int num2) {
		System.out.println(num1 - num2);
	}

	// metodo com retorno

	public int somaDoisnNumeros(int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
		// ou pode fazer
		// return num1 + num2;
	}
}
