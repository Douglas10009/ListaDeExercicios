import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class q1 {

	public static void main(String[] args) throws IOException {
		PrintWriter gravar = new PrintWriter(new FileWriter("saida.txt"));
		String nome = JOptionPane.showInputDialog("Digite o seu nome ");
		String data = JOptionPane.showInputDialog("Digite sua data de nascimento");
		String nacionalidade = JOptionPane.showInputDialog("Digite sua nacionalidade ");
		String naturalidade = JOptionPane.showInputDialog("Qual a sua naturalidade");
		String matricula = JOptionPane.showInputDialog("Qual a sua matricula ");
		
		gravar.printf("Nome: " + nome);
		gravar.printf("\nData de nascimento: " + data);
		gravar.printf("\nNacionalidade: " + nacionalidade);
		gravar.printf("\nNaturalidade: " + naturalidade);
		gravar.printf("\nMatricula: " + matricula);
		gravar.close();
	}

}
