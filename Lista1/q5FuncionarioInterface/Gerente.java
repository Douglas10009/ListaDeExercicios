public class Gerente implements ifuncionario {
    private double salario = 0;

    @Override
    public void setSalario(double salario) {
        this.salario += salario;
    }

    @Override
    public double getSalario() {
        return this.salario;
    }

    @Override
    public double bonus() {
        return this.salario + (this.salario *= 0.10); // Bonus de 10%
    }

    @Override
    public String info() {
        return "Gerente";
    }
    
}
