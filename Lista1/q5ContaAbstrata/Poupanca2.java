public class Poupanca2 extends Conta2{
    @Override
    public void sacar(double valor) {
        super.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        super.saldo += valor;
    }
}
