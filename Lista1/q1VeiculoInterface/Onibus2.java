public class Onibus2 implements Veiculo2 {

    @Override
    public void ligar() {
        System.out.println("Ônibus ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Ônibus desligado.");
    }

    @Override
    public String info() {
        return "Isso é um ônibus.";
    }
    
}
