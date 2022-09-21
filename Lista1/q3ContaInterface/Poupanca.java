public class Poupanca implements iConta{
    private double saldo = 0;
    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public double verSaldo() {
        return saldo;
    }
    
}
