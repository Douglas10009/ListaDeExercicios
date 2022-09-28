import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) throws IOException {
		String nome = "Notas1.txt";
		FileReader arquivo = new FileReader(nome);
		BufferedReader ler = new BufferedReader(arquivo);
		
		System.out.println("Iniciando a leitura do arquivo...");
		String linha = ler.readLine();
//		System.out.println(linha);
//		ler.lines().forEach(System.out::println);
		int qnt = 0;
		double soma = 0;
		double media = 0;
		
		String[] pedacos = null;
		while (linha != null) {
			pedacos = linha.split(";");
			for (String x : pedacos) {
				Double valores = Double.parseDouble(x);
				soma += valores;

				System.out.println(soma);
				System.out.println(valores);
				System.out.println(" ");

				qnt++;

			}
			ler.readLine();
		}
		
		ler.close();
	}

}