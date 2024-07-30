package aula2.poo.exercicio1;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		new Exercicio1();
	}
	
	public Exercicio1() {		
	
		
		
		Double num = Double.parseDouble(JOptionPane.showInputDialog("Insira um número com vírgula:"));
		JOptionPane.showMessageDialog(null, Math.round(num));	
	}
}
