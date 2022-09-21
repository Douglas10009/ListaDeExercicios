public class Principal {
    public static void main(String[] args) {
        iConta c = new Corrente();

        System.out.println("Conta Corrente - ");
        System.out.println("Saldo: " + c.verSaldo());
        System.out.println("Depositou R$ 100 (Juros de 0,1%) ");
        c.depositar(100);
        System.out.println("Saque de R$ 50 (Juros incluidos R$ 10)");
        c.sacar(50);
        System.out.println("Seu saldo é de " + c.verSaldo());

        iConta p = new Poupanca();
        System.out.println("\nConta Poupança - ");
        System.out.println("Saldo: " + p.verSaldo());
        System.out.println("Depositou R$ 500");
        p.depositar(500);
        System.out.println("Sacou R$ 10");
        p.sacar(10);
        System.out.println("Seu saldo é de " + p.verSaldo());
    }
}
