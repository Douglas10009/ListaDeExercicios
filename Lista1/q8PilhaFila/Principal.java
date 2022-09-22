import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Fila f = new Fila();
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira um número: ");
        f.inserir(sc.nextInt());   

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " é " + f.lista[i]);
        }

        System.out.print("Insira um número: ");
        f.inserir(sc.nextInt());

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " é " + f.lista[i]);
        }

        System.out.print("Insira um número: ");
        f.inserir(sc.nextInt());

        for (int i = 0; i < 10; i++) {
            System.out.println(i + " é " + f.lista[i]);
        }
        

        sc.close();
    }
}
