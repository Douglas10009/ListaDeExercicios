package Exercicio;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class helioGas {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do arquivo: ");
        String arquivo = sc.nextLine();

        PrintWriter gravar = new PrintWriter(new FileWriter(arquivo));

        // System.out.print("Digite o nome do integrante 1: ");
        // gravar.printf("Nome do integrante 1: %s%n" , sc.nextLine());
        // System.out.print("Digite a idade do integrante 1: ");
        // gravar.printf("Idade do integrante 1: %s%n " , sc.nextLine());

        // System.out.print("Digite o nome do integrante 2: ");
        // gravar.printf("Nome do integrante 2: %s%n" , sc.nextLine());
        // System.out.print("Digite a idade do integrante 2: ");
        // gravar.printf("Idade do integrante 2: %s%n", sc.nextLine());

        for (int i = 0; i < 2; i++) {
            System.out.printf("Digite o nome do integrante %d: ", i + 1);
            gravar.printf("Nome do integrante %d: %s%n", i + 1, sc.nextLine());
            sc.nextLine();
            System.out.printf("Digite a idade do integrante %d: ", i + 1);
            gravar.printf("Idade do integrante %d: %d%n", i + 1, sc.nextInt());
            gravar.print("\n");
        }

        System.out.println("Fim da gravação do arquivo.");
        gravar.close();
        sc.close();
    }

}
