public class Secretario implements ifuncionario {
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
        return this.salario + (this.salario *=  0.05); //Bonus de 5%
    }

    @Override
    public String info() {
        return "Secretário";
    }
    
}
