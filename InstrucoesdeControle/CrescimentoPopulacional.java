package InstrucoesdeControle;

public class CrescimentoPopulacional {

	// variaveis
	private int ano;
	private long popmundial;

	// construtor
	public CrescimentoPopulacional(int ano, long popmundial) {
		super();
		this.ano = ano;
		this.popmundial = popmundial;
	}

	public double populmundial() {
		return popmundial = (long) (popmundial * (1.12));
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public long getPopmundial() {
		return popmundial;
	}

	public void setPopmundial(long popmundial) {
		this.popmundial = popmundial;
	}

}
