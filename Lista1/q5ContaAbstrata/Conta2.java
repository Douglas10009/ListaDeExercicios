public abstract class Conta2 {
    protected double saldo = 0;
    
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    public double verSaldo() {
        return this.saldo;
    }
}
