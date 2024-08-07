package aula5.stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Exercicio1Test {

	@Test
	void test() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		List<Integer> lv = new ArrayList<Integer>();
		
		Exercicio1 ex = new Exercicio1();
		
		Integer resultado = ex.somaNumeros(l);
		Integer resultadoVazia = ex.somaNumeros(lv);
		
		assertEquals(60, resultado);
		assertEquals(60, resultadoVazia);
	}

}
