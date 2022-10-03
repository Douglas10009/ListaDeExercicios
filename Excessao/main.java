
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número 1: ");
        int n1 = sc.nextInt();

        System.out.println("Digite o número 2: ");
        int n2 = sc.nextInt();

        if (n2 == 0) {
            System.out.println("Não é possivel dividir por zero");
        } else {
            System.out.println("Divisão: " + n1 / n2);
               
        }

        sc.close();
    }
}