package aula3.tratamentoerros;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		try {
			int i = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro:"));
			JOptionPane.showMessageDialog(null, "Número válido: " + i);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Insira um número interio válido");
			main(args);
		}
	}
}
