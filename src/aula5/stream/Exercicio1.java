package aula5.stream;

import java.util.ArrayList;
import java.util.Random;

public class Exercicio1 {
	public static void main(String[] args) {
		new Exercicio1();
	}

	public Exercicio1() {
		ArrayList<Integer> l = new ArrayList<>();
		Random r = new Random();
		for (int i = 0; i < 50; i++) l.add(r.nextInt(100) + 1);
		int ls = l.stream().mapToInt(Integer::intValue).sum();
		System.out.println(ls);
	}
}
