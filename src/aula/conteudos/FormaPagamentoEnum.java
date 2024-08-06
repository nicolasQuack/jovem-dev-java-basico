package aula.conteudos;

import java.util.function.Supplier;

public enum FormaPagamentoEnum {
	CARTAO_CREDITO(1, "Cartão de crédito", () -> 0.0) ,
	CARTAO_DEBITO(2, "Cartão de débito", () -> 0.0),
	DINHEIRO(3, "Dinheiro", () -> {
		// Cálculo
		return 0.1;
	}),
	PIX(4, "PIX", () -> 0.1);
	
	private int numero;
	private String descricao;
	private Supplier<Double> desconto;
	
	private FormaPagamentoEnum(int numero, String descricao, Supplier<Double> desconto) {
		this.numero = numero;
		this.descricao = descricao;
		this.desconto = desconto;
	}
		
	public int getNumero() {
		return numero;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public Double getDesconto() {
		return desconto.get();
	}
	
}
