import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Saida {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo");
        String arquivo = "";
        arquivo = sc.nextLine();
        FileWriter arq = new FileWriter(arquivo);
        PrintWriter gravar = new PrintWriter(arq);
        // PrintWriter gravar = new PrintWriter(new FileWriter(arquivo));

        gravar.printf("Teste");
        for (int i = 0; i < 15; i++) {
            gravar.printf("Linha %s%n", i);
        }
        gravar.printf("Fim do arquivo");

        System.out.println("Fim da gravação");
        sc.close();
        gravar.close();
    }
}