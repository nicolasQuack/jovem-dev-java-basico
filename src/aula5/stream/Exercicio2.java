package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio2 {
	public static void main(String[] args) {
		new Exercicio2();
	}
	
	public Exercicio2() {
		List<Integer> l = new ArrayList<>();
		Random r = new Random();
		for (int i = 0; i < 50; i++) l.add(r.nextInt(100)+1);
		Double la = l.stream()
				.filter(n -> n > 50)
				.mapToInt(Integer::intValue)
				.average().getAsDouble();
		System.out.println(la);
	}
}
