package aula1.collections;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		String frase = JOptionPane.showInputDialog("Insira uma frase");
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < frase.length(); i++) {
			map.putIfAbsent(frase.charAt(i), 0);
			map.computeIfPresent(frase.charAt(i), (key, val) -> val + 1);
		}
		JOptionPane.showMessageDialog(null, map);
	}
}
