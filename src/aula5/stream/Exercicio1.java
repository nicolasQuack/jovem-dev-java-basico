package aula5.stream;

import java.util.List;

public class Exercicio1 {
	
	public Exercicio1() {
		
	}
	
	Integer somaNumeros(List<Integer> l) {
		return l.stream().mapToInt(Integer::intValue).sum();
	}
}
