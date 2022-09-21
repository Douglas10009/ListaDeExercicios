public class Principal2 {
    public static void main(String[] args) {
        Veiculo2 c = new Carro2();
        Veiculo2 m = new Moto2();
        Veiculo2 o = new Onibus2();

        System.out.println(c.info());
        c.ligar();
        c.desligar();

        System.out.println(m.info());
        m.desligar();
        m.ligar();

        System.out.println(o.info());
        o.ligar();
        o.desligar();
    }
}
