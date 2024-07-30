package aula2.poo.exercicio2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		new Exercicio2();
	}

	public Exercicio2() {
		ArrayList<String> arr = new ArrayList<String>();

		for (int i = 0; i < 2; i++) {
			arr.add(JOptionPane.showInputDialog("Insira a " + (i + 1) + "ª frase:"));
		}

		String msg = "As frases são iguais?\n" + (arr.get(0).equals(arr.get(1)) ? "Verdadeiro" : "Falso") + "\n\n";

		for (String s : arr) {
			msg += "Frase " + (arr.indexOf(s) + 1) + ": " + s + "\n\t Qtd: " + s + "\n\n";
		}

		JOptionPane.showMessageDialog(null, msg);

	}
}
