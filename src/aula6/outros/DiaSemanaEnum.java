package aula6.outros;

public enum DiaSemanaEnum {
	SEGUNDA(1, "Segunda-Feira") {
		@Override
		boolean isFimDeSemana() {
			return false;
		}
	}, 
	TERCA(2, "Terça-feira") {
		@Override
		boolean isFimDeSemana() {
			return false;
		}
	}, 
	QUARTA(3, "Quarta-feira") {
		@Override
		boolean isFimDeSemana() {
			return false;
		}
	}, 
	QUINTA(4, "Quinta-feira") {
		@Override
		boolean isFimDeSemana() {
			return false;
		}
	}, 
	SEXTA(5, "Sexta-feira") {
		@Override
		boolean isFimDeSemana() {
			return false;
		}
	}, 
	SABADO(6, "Sábado") {
		@Override
		boolean isFimDeSemana() {
			return true;
		}
	}, 
	DOMINGO(7, "Domingo") {
		@Override
		boolean isFimDeSemana() {
			return true;
		}
	};

	
	private int cod;
	private String nome;
	abstract boolean isFimDeSemana();
	
	private DiaSemanaEnum(int cod, String nome) {
		this.cod = cod;
		this.nome = nome;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getNome() {
		return nome;
	}
	
	
}
