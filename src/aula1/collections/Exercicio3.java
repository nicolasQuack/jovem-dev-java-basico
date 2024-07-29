package aula1.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Exercicio3 {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i < 50; i++) {
			Random r = new Random();
			lista.add(r.nextInt(20)+1);
		}
		
		Collections.sort(lista);
		
		for (Integer l : lista) {
			System.out.println(l);
		}
		
		System.out.println("********************");
		
		HashSet<Integer> conjunto = new HashSet<Integer>();
		
		conjunto.addAll(lista);
		
		for (Integer c : conjunto) {
			System.out.println(c);
		}
		
	}
}
