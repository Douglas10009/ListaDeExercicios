public class Principal2 {
    public static void main(String[] args) {
        Funcionario2 s = new Secretario2();
        Funcionario2 g = new Gerente2();
        Funcionario2 d = new Diretor2();

        System.out.println("\nNessa empresa, há 3 cargos:\n");
        s.setSalario(1000);
        System.out.println(s.info() + " que recebe um salário de R$1000 e um bonus de 5%, ficando: " + s.bonus());
        g.setSalario(1500);
        System.out.println(g.info() + " que recebe um salário de R$1500 e um bonus de 10%, ficando: " + g.bonus());
        d.setSalario(2000);
        System.out.println(d.info() + " que recebe um salário de R$2000 e um bonus de 25%, ficando: " + d.bonus());
    }
}
