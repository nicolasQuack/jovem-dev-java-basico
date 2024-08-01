package aula3.tratamentoerros;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import aula3.tratamentoerros.exceptions.PrecoIncorretoException;
import aula3.tratamentoerros.exceptions.VendaException;

public class Venda {
	String nomeCliente;
	ArrayList<Item> carrinho = new ArrayList<Item>();

	public static int qtdItens(int n) throws VendaException {
		if (n < 1 || n > 10) {
			throw new VendaException();
		} else {
			return n;
		}
	}
	
	public static void addItemCarrinho(int qtd) throws PrecoIncorretoException {
		for (int i = 0; i < qtd; i++) {
			Item it = new Item();
			it.nome = JOptionPane.showInputDialog("Insira o nome do produto:");
			int op = 0;
			do {
				try {
					it.preco = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do(a) " + it.nome + ":"));
					if (it.preco <= 0) {
						throw new PrecoIncorretoException();
					}
					op = 1;
				} catch (PrecoIncorretoException e) {
					JOptionPane.showMessageDialog(null, "Insira o preço novamente:");
				}
			} while (op == 0);
		}
	}
}
