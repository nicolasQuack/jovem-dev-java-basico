package aula6.outros;

public enum Calculadora1Enum {
	SOMA("Soma", ), 
	SUBTRACAO("Subtração", (x, y) -> {
		
	}), 
	DIVISAO("Divisão", (x, y) -> {
		
	}), 
	MULTIPLICACAO("Multiplicação", (x, y) -> {
		
	});

	private String nomeAmigavel;
	CalculoInterface c;
	
	private Calculadora1Enum(String nomeAmigavel) {
		this.nomeAmigavel = nomeAmigavel;
	}

	public String getNomeAmigavel() {
		return nomeAmigavel;
	}
	
}
