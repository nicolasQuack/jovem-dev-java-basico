package aula5.stream;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Desafio {
	public static void main(String[] args) {
		new Desafio();
	}
	
	public Desafio() {
	
		List<Pessoa> l = new ArrayList<Pessoa>();
		String[] ln = {"Nicolas", "Roberto", "Gustavo", "André", "Renato", "Jhon", "Marcos", "Zeni", "Yasmin", "Igor"};
		LocalDate start = LocalDate.of(1970, Month.JANUARY, 1);
		long days = ChronoUnit.DAYS.between(start, LocalDate.now());
		
		for (int i = 0; i < 10; i++) {
			l.add(new Pessoa());
			l.get(i).setNome(ln[i]);
			l.get(i).setDataNasc(start.plusDays(new Random().nextInt((int) days + 1)));
		}
		
		List<Pessoa> ls = l.stream()
			.filter(p -> isVowel(p.getNome().charAt(0)) || p.getDataNasc().isLeapYear())
			.sorted((p1, p2) -> p1.getNome().compareTo(p2.getNome()))
			.collect(Collectors.toList());
	
		for (Pessoa pessoa : ls) {
			System.out.print(pessoa.getNome() + "; ");
		}
		
		
	}
	
	public static boolean isVowel (char c) {
		
		char[] arr = {'a', 'e', 'i', 'o', 'u'};
		
		c = Character.toLowerCase(c);
		return c == arr[0] || c == arr[1] || c == arr[2] || c == arr[3] || c == arr[4];
	}
}
