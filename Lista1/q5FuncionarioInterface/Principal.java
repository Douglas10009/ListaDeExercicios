public class Principal {
    public static void main(String[] args) {
        ifuncionario s = new Secretario();
        ifuncionario g = new Gerente();
        ifuncionario d = new Diretor();

        System.out.println("\nNessa empresa, há 3 cargos:\n");
        s.setSalario(1000);
        System.out.println(s.info() + " que recebe um salário de R$1000 e um bonus de 5%, ficando: " + s.bonus());
        g.setSalario(1500);
        System.out.println(g.info() + " que recebe um salário de R$1500 e um bonus de 10%, ficando: " + g.bonus());
        d.setSalario(2000);
        System.out.println(d.info() + " que recebe um salário de R$2000 e um bonus de 25%, ficando: " + d.bonus());
    }
}
