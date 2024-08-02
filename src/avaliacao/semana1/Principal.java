package avaliacao.semana1;

import javax.swing.JOptionPane;

import avaliacao.semana1.classes.Cliente;
import avaliacao.semana1.classes.ClientePremium;
import avaliacao.semana1.classes.Produto;
import avaliacao.semana1.classes.Venda;

// Não inseri um lambda e o method

public class Principal {
	public static void main(String[] args) {
		new Principal();
	}
	
	public Principal() {
		Venda v = new Venda();
		
		String nome = JOptionPane.showInputDialog("Insira o seu nome:");
		v.setCliente(nome, nome.contains("Thiago") ? new ClientePremium() : new Cliente());
		
		String msg = "";
		do {
			msg = JOptionPane.showInputDialog("Insira o nome do produto ou fim para finalizar a compra:");
			v.addProdutoCarrinho(msg, new Produto());
		} while (!"fim".equals(msg));
		
		int cod = 0;
		do {
			cod = Integer.parseInt(JOptionPane.showInputDialog("Insira a forma de pagamento:\n\n1 - Cartão de Crédito\n2 - Cartão de Débito\n3 - Dinheiro"));
			if (cod < 1 && cod > 3) {
				JOptionPane.showMessageDialog(null, "Insira uma forma de pagamento válida:");
			} else {
				v.setFormaPagamento(cod);
			}
			
		} while (cod < 1 && cod > 3);
		
		JOptionPane.showMessageDialog(null, v.gerarCupomFiscal());
	}
}
