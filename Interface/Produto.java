package Interface;

//interface define os metodos obrigatorios
//mas nao diz a forma deve ser implementados

public class Produto implements Tributavel, Transportavel {

	// variaveis
	private String nome;
	private double preco;
	private double peso;
	private double PrecoFinal;
	private double ValorFrete;

	@Override
	public void CalcularImposto() {

		PrecoFinal = this.preco + this.preco * imposto;
	}

	@Override
	public void CalcularFrete() {

		this.ValorFrete = this.preco / peso * 0.1;
	}

	public Produto(String nome, double preco, double peso) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Produto [nome = " + nome + ", preco = " + preco + ", peso = " + peso + ", PrecoFinal = " + PrecoFinal
				+ ", ValorFrete = " + ValorFrete + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPrecoFinal() {
		return PrecoFinal;
	}

	public double getValorFrete() {
		return ValorFrete;
	}

}
