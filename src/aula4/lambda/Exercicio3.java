package aula4.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		ArrayList<Aluno> l = new ArrayList<Aluno>();
		for (int i = 0; i < 5; i++) {
			l.add(new Aluno());
			l.get(i).setNome(JOptionPane.showInputDialog("Insira o nome do " + (i + 1) + "º aluno:"));
		}

		List<Aluno> filteredList = l.stream()
				.filter(t -> !t.getNome().toLowerCase().startsWith("t") && !t.getNome().toLowerCase().endsWith(""))
				.collect(Collectors.toList());

		filteredList.forEach(s -> System.out.println(s.getNome()));
	}
}
