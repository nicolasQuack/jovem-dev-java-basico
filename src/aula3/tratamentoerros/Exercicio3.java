package aula3.tratamentoerros;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.stream.Stream;

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
			new ArrayList<String>().get(0);
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		try {
				
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
	}

	public static Integer divisao(Integer x, int y) {
		return x / y;
	}
}
