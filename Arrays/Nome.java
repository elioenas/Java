package Arrays;

public class Nome {

	public static void main(String[] args) {

		// variaveis
		String[] nomes = new String[3];
		nomes[0] = "Jose";
		nomes[1] = "Kayo";
		nomes[2] = "Leandro";

		// vai percorrer e exibir os nomes
		for (int i = 0; i < 3; i++) {
			System.out.println("nome:" + nomes[i]);
		}

	}

}
