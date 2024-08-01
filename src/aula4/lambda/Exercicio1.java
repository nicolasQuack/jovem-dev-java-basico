package aula4.lambda;

import java.util.ArrayList;
import java.util.Random;

public class Exercicio1 {
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < 50; i++) l.add(r.nextInt(50));
		l.forEach(System.out::println);
	}
}