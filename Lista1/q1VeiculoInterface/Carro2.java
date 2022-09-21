public class Carro2 implements Veiculo2 {

    @Override
    public void ligar() {
        System.out.println("Carro ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Carro desligado.");
    }

    @Override
    public String info() {
        return "Isso é um carro";
    }
    
}
