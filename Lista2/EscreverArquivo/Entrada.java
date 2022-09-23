import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo: ");
        String nome = sc.nextLine();

        FileReader arq = new FileReader(nome);
        BufferedReader ler = new BufferedReader(arq);

        System.out.println("Inicando a leitura do arquivo");
        String linha = ler.readLine(); // Primeira linha a ser lida
        while (linha != null) {
            System.out.println(linha);
            linha = ler.readLine();
        }
        System.out.println("Finalizando a leitura do arquivo.");
        arq.close();
        sc.close();
    }
}
