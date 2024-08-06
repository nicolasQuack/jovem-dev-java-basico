package aula.conteudos;

import java.math.BigDecimal;

public class Enums {
	public static void main(String[] args) {
		new Enums();
	}

	public Enums() {
		
		FormaPagamentoEnum f = FormaPagamentoEnum.DINHEIRO;
		Double totalVenda = 800.00;
		
		Double d = 0.1 + 0.2;
		
		BigDecimal divideNum = BigDecimal.valueOf(0.1);
		BigDecimal num = BigDecimal.valueOf(0.1).divide(divideNum);
		
		System.out.println(num);
	}
}
