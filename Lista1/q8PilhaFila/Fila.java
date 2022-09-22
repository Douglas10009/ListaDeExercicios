public class Fila implements Lista {

    int[] lista = new int[10];
    int contador = 0;

    @Override
    public void inserir(int x) {
        for (int i = 0; i < lista.length; i++) {
            if (contador > 0) {
                if (lista[i] == lista[i - 1]) {
                    break;
                } else {
                    lista[i] = x;
                    contador++;

                    break;
                }
            } else {
                lista[i] = x;
                System.out.println("lá");
                contador++;

                break;
            }
            // contador ++;
        }
    }

    @Override
    public void remover() {
        // TODO Auto-generated method stub

    }

}
