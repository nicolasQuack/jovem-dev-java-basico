package aula7.testes;

import java.util.List;
import java.util.stream.Collectors;

import aula5.stream.Pessoa;

public class Exercicio1 {
	
	public static List<String> getNomes (List<Pessoa> l) {
		return l.stream()
				.filter(p -> isVowel(p.getNome()) || p.getDataNasc().isLeapYear())
				.sorted((p1, p2) -> p1.getNome().compareTo(p2.getNome()))
				.map(Pessoa::getNome)
				.collect(Collectors.toList());
	}	
	
	private static boolean isVowel (String s) {
		char[] arr = {'a', 'e', 'i', 'o', 'u'};
		char c = Character.toLowerCase(s.charAt(0));
		return c == arr[0] || c == arr[1] || c == arr[2] || c == arr[3] || c == arr[4];
	}

}
