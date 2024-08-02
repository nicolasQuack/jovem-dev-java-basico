package avaliacao.semana1.classes;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Venda {

	private Cliente cliente;
	private ItemVenda carrinho = new ItemVenda();
	private String formaPagamento;
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(String nome, Cliente cliente) {
		cliente.setNome(nome);
		int op = 0;
		do {
			try {
				cliente.setDataNasc(LocalDate.parse(
						JOptionPane.showInputDialog("Insira a sua data de nascimento: (dd/MM/yyyy)"), formatter));
				op = 1;
			} catch (DateTimeParseException e) {
				JOptionPane.showMessageDialog(null, "Insira uma data válida!");
			}
		} while (op == 0);
		this.cliente = cliente;
	}

	public ItemVenda getCarrinho() {
		return carrinho;
	}

	public void addProdutoCarrinho(String nome, Produto produto) {
			carrinho.addProdutoCarrinho(nome, produto);
	}

	public void setFormaPagamento(int cod) {
		switch (cod) {
		case 1:
			formaPagamento = "Cartão de Crédito";
			break;
		case 2:
			formaPagamento = "Cartão de Débito";
			break;
		case 3: 
			formaPagamento = "Dinheiro";
			break;
		}
	}
	
	public int getDesconto() {
		DateTimeFormatter formatterDiscount = DateTimeFormatter.ofPattern("dd/MM");
		if (getCliente().getDataNasc().format(formatterDiscount) == LocalDate.now().format(formatterDiscount)) {
			return 30;
		}
		if (getCliente().getClass() == ClientePremium.class) {
			return 20;
		}
		if (!getCliente().getDataNasc().plusYears(60).isAfter(LocalDate.now())) {
			return 10;
		}
		
		return 0;
	}
	
	public String gerarCupomFiscal() {
		
		DecimalFormat df = new DecimalFormat("0.00");

		String msg = "\t******** CUPOM ********\n\n";
		
		Double subTotal = 0.0;
		for (int i = 0; i < carrinho.getCarrinho().size(); i++) {
			
			String nome = carrinho.getCarrinho().get(i).getNome();
			int qtd = carrinho.getCarrinho().get(i).getQuantidade();
			Double preco = carrinho.getCarrinho().get(i).getPrecoUnidade();
			subTotal += preco*qtd;
			msg += nome + " kg\n";
			msg += qtd + "x " + preco + " ************** " + df.format(preco*qtd) + "\n";
			
		}
		
		// faltou arrumar a saida de desconto para o usuario
		
		Pattern p = Pattern.compile("[a-zA-Z]");
		msg += "\nSubTotal ************** " + df.format(subTotal) + "\n";
		msg += "Descto. " + getDesconto() + "% ";
		msg += getDesconto() == 30 ? "aniversário" : getDesconto() == 20 ? "cliente premium" : getDesconto() == 10 ? "terceira idade" : "";
		msg += "\n\n";
		msg += "Total ************** " + df.format(subTotal*(1.0-(getDesconto()/100))) + "\n";
		msg += "Forma de pagamento: " + formaPagamento + "\n";
		String primeiraLetra = String.valueOf(getCliente().getNome().charAt(0));
		String restoDoNome = getCliente().getNome().substring(1);
		msg += "Cliente: " + primeiraLetra + restoDoNome.replaceAll(p.pattern(), "*");
		
		return msg;
		
	}

}
