import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JPanel;


public class Principal {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int ano = cal.get(Calendar.YEAR);
		
		JFrame frame = new JFrame();
		JPanel painel = new JPanel();
		
		JButton botao = new JButton("Confirma");
		JButton botao1 = new JButton("Cancelar");
		
		painel.add(botao);
		painel.add(botao1);
		
		frame.add(painel);
		frame.setBounds(0,0,800,600);
		frame.setVisible(true);
		
		JOptionPane.showMessageDialog(null, "Douglas");
		int resposta = JOptionPane.showConfirmDialog(null, "Douglas"); //Retorna 0 se for o YES e 1 se for NO
		
		if (resposta ==0) {
			JOptionPane.showMessageDialog(null, "Belo gosto amige");
		}else if (resposta == 1) {
			JOptionPane.showMessageDialog(null, "Sua bunda seu corno desgraçado");
		} else {
			JOptionPane.showMessageDialog(null, "._.");
		}
		
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		String sdata = JOptionPane.showInputDialog("Digite seu ano:  ");
		
		JOptionPane.showMessageDialog(null, "Olá " + nome);
		
		int data = Integer.parseInt(sdata);
		int idade = ano - data;
		JOptionPane.showMessageDialog(null, "Você tem " + idade );
		JOptionPane.showMessageDialog(null, "O ano é  " + ano );
		
		
		
	}
}
