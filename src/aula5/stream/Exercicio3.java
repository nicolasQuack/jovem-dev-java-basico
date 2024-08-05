package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercicio3 {
	public static void main(String[] args) {
		new Exercicio3();
	}

	public Exercicio3() {
		List<Integer> l = new ArrayList<Integer>();
		Random r = new Random();
		for (int i = 0; i < 50; i++) l.add(r.nextInt(100)+1);
		long lc = l.stream().filter(n -> n == 25).count();
		System.out.println(lc);
	}
}
