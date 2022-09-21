public abstract class Funcionario2 {
    protected double salario = 0;

    public void setSalario(double salario) {
        this.salario += salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public abstract double bonus();
    public abstract String info();
}
