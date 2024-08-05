package aula.conteudos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;

public class Stream {
	public static void main(String[] args) {
		new Stream();

	}

	public Stream() {
		List<String> lista = new ArrayList<>();
		lista.add("a1");
		lista.add("b");
		lista.add("c");
		lista.add("d");
		lista.add("a2");
		lista.add("a3");
		lista.add("a1");

		lista.stream()
			.filter(Objects::nonNull)
			.filter(e -> e.startsWith("a"))
			.map(String::toUpperCase)
			.distinct()
			.limit(2);
	}
}
