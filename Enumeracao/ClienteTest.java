package Enumeracao;

import Enumeracao.Cliente.TipoCliente;

public class ClienteTest {

	public static void main(String[] args) {

		Cliente cliente = new Cliente("Roberto", TipoCliente.Pessoa_Fisica);
		System.out.println(cliente);
	}
}
