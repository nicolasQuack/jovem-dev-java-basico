package aula4.lambda;

import java.util.ArrayList;

public class Desafio {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			l.add("teste");
		}
		Mostrador c = String::toUpperCase; 
		l.forEach(t -> System.out.println(c.mostra(t)));
	}
}
