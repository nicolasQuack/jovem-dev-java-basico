package aula7.testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import aula5.stream.Desafio;
import aula5.stream.Pessoa;

class Exercicio1Testes {
	
	List<Pessoa> l = new ArrayList<Pessoa>();
	
	@BeforeEach
	void setup() {
	}

	@Test
	void testeQuandoListaEstaVazia() {
		
		List<String> ls = Exercicio1.getNomes(l);
		
		assertEquals(l.clear(), ls);
	}

}
