import javax.swing.JOptionPane;

public class Vetor1 {

    public void preencherVetor() throws Exception{
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            String nome = JOptionPane.showInputDialog("Digite o valor do vetor: ");
            vetor[i] = Integer.parseInt(nome);
        }

        for (int i = 0; i < vetor.length; i++) {
            JOptionPane.showMessageDialog(null, "Valores: " + vetor[i]);
        }
    }

}
