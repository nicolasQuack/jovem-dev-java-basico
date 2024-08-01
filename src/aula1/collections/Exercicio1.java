package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Exercicio1 {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>(3);
		System.out.println(lista.size());
		for (int i = 0; i < 10; i++) {
			Random r = new Random();
			lista.add(r.nextInt(50));
		}
		
		Collections.sort(lista);
		
		for (Integer i : lista) {
			System.out.println(i);
		}
	}
}
