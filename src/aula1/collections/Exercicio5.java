package aula1.collections;

import java.util.HashSet;
import java.util.Random;

public class Exercicio5 {
	public static void main(String[] args) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		Random r = new Random();
		
		for (int i = 0; i < 10; i++) {
			set1.add(r.nextInt(30)+1);
			set2.add(r.nextInt(30)+1);
		}
		
		System.out.println(set1);
		System.out.println(set2);
		
		set1.addAll(set2);
		
		System.out.println(set1);
		
	}
}
