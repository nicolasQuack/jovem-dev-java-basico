package aula1.collections;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Exercicio6 {
	public static void main(String[] args) {

		String msg = "Sala de aula:\n\nAlunos:\n\n";
		DecimalFormat df = new DecimalFormat("0.00");

		HashMap<String, ArrayList<Double>> alunos = new HashMap<String, ArrayList<Double>>();
		for (int i = 0; i < 5; i++) {
			ArrayList<Double> notas = new ArrayList<Double>();
			alunos.put(JOptionPane.showInputDialog("Insira o nome do aluno(a) " + (i + 1) + ":"), notas);
		}

		alunos.forEach((s, n) -> {
			for (int i = 0; i < 3; i++) {
				n.add(Double.parseDouble(JOptionPane.showInputDialog("Insira a " + (i + 1) + " nota da " + s + ":")));
			}
			;
		});

		for (String key : alunos.keySet()) {
			Double soma = 0.0;
			ArrayList<Double> arr = alunos.get(key);

			msg += key + ": ";

			for (int i = 0; i < arr.size(); i++) {
				soma += arr.get(i);
				msg += arr.get(i) + ", ";
			}
			Double media = soma / 3;
			msg += df.format(media) + ".\n\n";

		}
		JOptionPane.showMessageDialog(null, msg);
	}
}