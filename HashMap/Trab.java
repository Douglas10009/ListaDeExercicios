import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
// import java.awt.Color;

public class Trab {
    public static void main(String[] args) {
		//Cria o painel
		JFrame frame = new JFrame();
		JPanel painel = new JPanel();
		painel.setBackground(Color.white);
        // frame.setBackground(Color.pink);

		//Adiciona a label
		JLabel label = new JLabel("Olá mundo...");
		label.setForeground(Color.BLUE);
		// label.setBounds(0, 1000 ,2650,20);
		label.setSize(1000, 100);
		painel.add(label);

		//Cria e Adiciona os botões 
		JButton botao = new JButton("Confirma");
		JButton botao1 = new JButton("Cancelar");
		painel.add(botao);
		painel.add(botao1);

		//Adiciona o painel no frame
		frame.add(painel);
		frame.setBounds(0,0,800,600);
		frame.setVisible(true);
    }
}
