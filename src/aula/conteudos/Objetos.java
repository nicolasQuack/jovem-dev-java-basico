package aula.conteudos;

import java.time.LocalDate;

public class Objetos {

	public static void main(String[] args) {
		new Objetos();
	}

	public Objetos() {
		LocalDate nasc = LocalDate.of(2004, 4, 21);
		LocalDate now = LocalDate.now();
		System.out.println(now.compareTo(nasc));

	}
}
