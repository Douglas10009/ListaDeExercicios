public class Secretario2 extends Funcionario2 {
    @Override
    public double bonus() {
        return this.salario + (this.salario *= 0.05); // Bonus de 5%
    }

    @Override
    public String info() {
        return "Secretário";
    }
}
