package Interface;

public class ProdutoTest {

	public static void main(String[] args) {

		Produto produto = new Produto("PlayStation4", 1900, 2);
		produto.CalcularImposto();
		produto.CalcularFrete();
		System.out.println(produto);
	}
}
