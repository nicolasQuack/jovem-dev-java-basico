package aula3.tratamentoerros;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Exercicio3 {
	public static void main(String[] args) throws IOException {
		try {
			divisao(1, 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		try {
			divisao(null, 1);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		try {
			"".charAt(0);
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		try {
			Iterator<String> i = new ArrayList<String>().iterator();
			i.remove();
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
	}

	public static Integer divisao(Integer x, int y) {
		return x / y;
	}
}
