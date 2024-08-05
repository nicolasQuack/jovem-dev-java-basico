package aula5.stream;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio4 {
	public static void main(String[] args) {
		new Exercicio4();
	}

	public Exercicio4() {
		LocalDate start = LocalDate.of(1970, Month.JANUARY, 1);
		long days = ChronoUnit.DAYS.between(start, LocalDate.now());
		List<Pessoa> l = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Pessoa p = new Pessoa();
			p.setNome(String.valueOf(i + 1));
			p.setTelefone("(xx)xxxx-xxxx");
			p.setDataNasc(start.plusDays(new Random().nextInt((int) days + 1)));
			l.add(p);
		}
		List<Pessoa> lfs = l.stream().filter(p -> p.getDataNasc().getMonthValue() == 5).toList();
		for (Pessoa pessoa : lfs) {
			System.out.println(pessoa.getNome());
		}
	}
}
