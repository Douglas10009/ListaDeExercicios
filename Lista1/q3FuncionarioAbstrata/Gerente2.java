public class Gerente2 extends Funcionario2 {
    @Override
    public double bonus() {
        return this.salario + (this.salario *= 0.25); // Bonus de 25%
    }

    @Override
    public String info() {
        return "Diretor";
    }
}
