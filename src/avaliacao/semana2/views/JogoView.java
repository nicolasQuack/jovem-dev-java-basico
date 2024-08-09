package avaliacao.semana2.views;

import avaliacao.semana2.models.Heroi;
import avaliacao.semana2.models.Inimigo;

public class JogoView {
	public static void main(String[] args) {
		new JogoView();
	}
	
	public JogoView() {
		
		Personagens p = new Personagens();
		p.setListaHerois(new Heroi("Nicolas", 9999, 9999, 9999));
		for (Heroi h: p.getListaHerois()) {
			System.out.println("\n\n" + h.getNome().toUpperCase() + " ENTROU NA DUNGEON!\n\n");
			for (Inimigo i: p.getListaInimigos()) {
				h.batalhar(i);
			}
		}
	}
}
