package avaliacao.semana1.classes;

import avaliacao.semana1.exceptions.QuantidadeIncorretaException;

public class Produto {
	private String nome;
	private Double precoUnidade;
	private int quantidade;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPrecoUnidade() {
		return precoUnidade;
	}
	public void setPrecoUnidade(Double precoUnidade) {
		this.precoUnidade = precoUnidade;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) throws QuantidadeIncorretaException {
		if (quantidade < 0 || quantidade > 50) {
			throw new QuantidadeIncorretaException();
		}
		this.quantidade = quantidade;
	}
}
