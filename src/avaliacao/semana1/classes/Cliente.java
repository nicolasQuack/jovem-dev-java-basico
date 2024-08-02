package avaliacao.semana1.classes;

import java.time.LocalDate;

public class Cliente {
	
	private String nome;
	private LocalDate dataNasc;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
}
