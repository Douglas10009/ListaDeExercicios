import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Entrada {

	public static void main(String[] args) throws IOException {
		String nome = "Notas.txt";
		FileReader arquivo = new FileReader(nome);
		BufferedReader ler = new BufferedReader(arquivo);
		
		System.out.println("Iniciando a leitura do arquivo...");
		String linha = ler.readLine();
		System.out.println(linha);
		ler.lines().forEach(System.out::println);
		ler.close();
	}

}
