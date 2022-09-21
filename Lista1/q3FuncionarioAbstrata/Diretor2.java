public class Diretor2 extends Funcionario2 {

    @Override
    public double bonus() {
        return super.salario + (super.salario *= 0.25); // Bonus de 25%
    }

    @Override
    public String info() {
        return "Diretor";
    }
    
}
