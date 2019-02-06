package Orientaçãoaobjetos;

public class HeartRate {

	String nome;
	String sobrenome;
	int datadenascimento;

	public HeartRate(String nom, String sobren, int datadenasc) {
		super();
		this.nome = nom;
		this.sobrenome = sobren;
		this.datadenascimento = datadenasc;
	}

	public int frequenciacardiacaMaxima()

	{

		return 220 - getDatadenascimento();

	}

	public void frequenciacardiacaAlvo() {

		System.out.printf( "%.1f to %.1f BPM (batimentos por minuto)",
				 frequenciacardiacaMaxima() * 0.50 , frequenciacardiacaMaxima() * 0.85);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nom) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobren) {
		this.sobrenome = sobren;
	}

	public int getDatadenascimento() {
		return datadenascimento;
	}

	public void setDatadenascimento(int datadenasc) {
		this.datadenascimento = datadenasc;
	}

}
