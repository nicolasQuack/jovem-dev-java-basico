package avaliacao.semana1.classes;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import avaliacao.semana1.exceptions.QuantidadeIncorretaException;

public class ItemVenda {
	private ArrayList<Produto> carrinho = new ArrayList<Produto>();

	public ArrayList<Produto> getCarrinho() {
		return carrinho;
	}

	public void addProdutoCarrinho(String nome, Produto produto) {
		if (!"fim".equals(nome)) {
			produto.setNome(nome);
			produto.setPrecoUnidade(Double.parseDouble(
					JOptionPane.showInputDialog("Insira o valor unitário do(a) " + produto.getNome() + ":")));
			int op = 0;
			do {
				try {
					produto.setQuantidade(Integer.parseInt(JOptionPane
							.showInputDialog("Insira a quantidade de " + produto.getNome() + " que você deseja levar:")));
					op = 1;
				} catch (QuantidadeIncorretaException | RuntimeException e) {
					JOptionPane.showMessageDialog(null, "Insira uma quantidade válida: (maior que 0 e menor que 50)");
				}
			} while (op == 0);
			carrinho.add(produto);
		}
	}

}
