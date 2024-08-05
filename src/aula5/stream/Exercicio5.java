package aula5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import aula5.stream.exceptions.ZeroBertoException;

public class Exercicio5 {
	public static void main(String[] args) throws ZeroBertoException {
		new Exercicio5();
	}
	
	public Exercicio5() throws ZeroBertoException {
		List<Pessoa> l = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Pessoa p = new Pessoa();
			p.setNome(""+(i+1)/*+"berto"*/);
			l.add(p);
		}
		Optional<Pessoa> op = l.stream().filter(t -> t.getNome().endsWith("berto")).findFirst();
		System.out.println(op.orElseThrow(ZeroBertoException::new).getNome());
	}
}
