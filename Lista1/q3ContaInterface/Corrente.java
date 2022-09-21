public class Corrente implements iConta{
    private double saldo = 0;

    @Override
    public void sacar(double valor) {
        double juros = valor + 10;
        this.saldo = this.saldo - juros; //Taxa de 10 reais por saque
        System.out.println("Saque de R$" + valor +" realizado. Ficando com " + this.saldo + " e pagando um juros de " + juros);
    }

    @Override
    public void depositar(double saldo) {
        double juros = saldo * 0.001; //Juros de 0,01%
        double saldoJuros = saldo - juros;
        this.saldo += saldoJuros;
        System.out.println("Depósito de " + saldo + " feito. Ficando com " + this.saldo + " e pagando um juros de " + juros);
    }

    @Override
    public double verSaldo() {
        return this.saldo;
    }
}
