// import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        Veiculo c = new Carro(); // Como faria para isso funcionar? em loop
        Veiculo m = new Moto();
        Veiculo o = new Onibus();

        System.out.println(c.info());
        c.ligar();
        c.desligar();

        System.out.println(m.info());
        m.desligar();
        m.ligar();

        System.out.println(o.info());
        o.ligar();
        o.desligar();

        // System.out.println("Quer ligar o carro? [Sim ou Não]");
        // String ligar = sc.nextLine();

        // if (ligar.equals("Sim")) {
        //     c.ligar();
        //     System.out.println("Quer desligar-lo?");
        //     ligar = sc.nextLine();

        //     if (ligar.equals("Sim")) {
        //         c.desligar();
        //     } else {
        //         System.out.println("Ok, see ya");
        //     }
        // } else {
        //     System.out.println("Ok, see ya");
        // }
        

    }
}
