package aula3.tratamentoerros;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.VendaException;

public class Desafio {
	public static void main(String[] args) {
		new Desafio();
	}
	
	public Desafio() {
		Venda v = new Venda();
		v.nomeCliente = JOptionPane.showInputDialog("Insira o nome do cliente:");
		try {
			int qtd = Venda.qtdItens(Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de produtos para essa venda:")));
			Venda.addItemCarrinho(qtd);
		} catch (VendaException e) {
			JOptionPane.showMessageDialog(null, "Quantidade não suportada!");
		}
		
	}
	
}
