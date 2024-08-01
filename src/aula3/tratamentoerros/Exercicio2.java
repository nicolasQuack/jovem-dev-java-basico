package aula3.tratamentoerros;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.ZeroException;

public class Exercicio2 {
	public static void main(String[] args) {
		try {
			int n = divisao(Integer.parseInt(JOptionPane.showInputDialog("Insira o dividendo:")),
					Integer.parseInt(JOptionPane.showInputDialog("Insira o divisor:")));
			JOptionPane.showMessageDialog(null, n);
		} catch (ZeroException e) {
			JOptionPane.showMessageDialog(null, "O segundo número não pode ser zero");
		}
	}

	public static Integer divisao(int x, int y) throws ZeroException {
		if (y == 0) {
			throw new ZeroException();
		} else {
			return x / y;
		}
	}
	
}
