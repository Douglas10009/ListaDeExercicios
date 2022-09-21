public class Moto2 implements Veiculo2 {

    @Override
    public void ligar() {
        System.out.println("Moto ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("Moto desligada.");
    }

    @Override
    public String info() {
        return "Isso é uma moto";
    }
    
}
