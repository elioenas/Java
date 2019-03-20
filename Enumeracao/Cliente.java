package Enumeracao;

public class Cliente {

	// atributos
	// o enum foi usado para agrupar duas constantes que seria a
	// pessoa fisica e juridica
	enum TipoCliente {
		Pessoa_Fisica, Pessoa_Juridica;
	}

	private String nome;
	private TipoCliente tipo;

	// Construtor
	public Cliente(String nome, TipoCliente tipo) {
		super();
		this.nome = nome;
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", tipo=" + tipo + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoCliente getTipo() {
		return tipo;
	}

	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}

}
