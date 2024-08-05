package aula.conteudos;

import java.time.LocalDateTime;
import java.util.Optional;

public class Optionals {
	public static void main(String[] args) {
		new Optionals();
	}
	
	public Optionals() {
		String s = getString();
		
		Optional<String> optS = Optional.ofNullable(s);
		
		System.out.println(optS.orElseGet(this::getValorPadrao));
		System.out.println(optS.orElseThrow(NullPointerException::new));
	}
	
	
	private String getValorPadrao() {
		System.out.println("Entrou no método GetValorPadrao");
		return "Não foi possível obter a String";
	}
	
	private String getString() {
		if (LocalDateTime.now().getSecond() % 2 == 0) {
			return "Retornou";
		}
		return null;
	}
}
