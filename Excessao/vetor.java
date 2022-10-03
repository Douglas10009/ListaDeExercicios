import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class vetor {
    public static void main(String[] args) {
        

        
        Scanner sc = new Scanner(System.in);
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
