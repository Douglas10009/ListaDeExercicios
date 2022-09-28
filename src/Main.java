import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) throws IOException {
//		String arquivo1 = "Notas1.txt";
//		PrintWriter gravar = new PrintWriter(new FileWriter(arquivo1));
//
//		for (int i = 0; i < 5; i++) {
//			gravar.printf(i + ";");
//		}
//
//		System.out.println("Fim da gravação");
//		gravar.close();

		String nome = "Notas1.txt";
		FileReader arquivo = new FileReader(nome);
		BufferedReader ler = new BufferedReader(arquivo);

		System.out.println("Iniciando a leitura do arquivo...");
		String linha = ler.readLine();
		System.out.println(linha);
		ler.lines().forEach(System.out::println);
		ler.toString();
		String[] pedacos = new String[3];
		pedacos = linha.split(";");

		String[] linha_espaco = new String[3];
		linha_espaco = linha.split(" ");

		int qnt = 0;
		double soma = 0;
		double media = 0;
		Double[] numeros = new Double[3];

		for (int i = 0; i < linha_espaco.length; i++) {

			for (String x : pedacos) {
				Double valores = Double.parseDouble(x);
				soma += valores;
//				numeros[qnt] = valores;

				System.out.println(soma);
				System.out.println(valores);
				System.out.println(" ");

				qnt++;

			}
		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		arquivo.close();

	}

}
