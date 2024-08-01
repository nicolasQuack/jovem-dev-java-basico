package aula4.lambda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

public class Exercicio2 {
	public static void main(String[] args) {
		ArrayList<Aluno> l = new ArrayList<Aluno>();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		for (int i = 0; i < 5; i++) {
			l.add(new Aluno());
			l.get(i).setId(i + 1);
		}

		l.forEach((aluno) -> {
			aluno.setNome(JOptionPane.showInputDialog("Insira o nome do " + aluno.getId() + "º aluno:"));
			aluno.setDataNasc(LocalDate
					.parse(JOptionPane.showInputDialog("Insira a data do seu nascimento: (dd/MM/yyyy)"), formatter));
		});

		List<Aluno> sortedByAge = l.stream().sorted(Comparator.comparing(Aluno::getDataNasc))
				.collect(Collectors.toList());

		sortedByAge.forEach(s -> System.out.println(s.getNome() + "\n" + s.getDataNasc().format(formatter) + "\n\n"));
	}
}
