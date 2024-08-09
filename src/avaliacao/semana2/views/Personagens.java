package avaliacao.semana2.views;

import java.util.ArrayList;
import java.util.List;

import avaliacao.semana2.models.Heroi;
import avaliacao.semana2.models.Inimigo;

public class Personagens {
	
	List<Heroi> listaHerois = new ArrayList<>();
	List<Inimigo> listaInimigos = new ArrayList<>();
	
	public Personagens() {
		
		// Herois
		listaHerois.add(new Heroi("Mago", 30, 18, 23));
		listaHerois.add(new Heroi("Bárbaro", 100, 20, 18));
		listaHerois.add(new Heroi("Paladino", 50, 20, 19));
		
		// Inimigos
		listaInimigos.add(new Inimigo("Morcego", 10, 5, 5));
		listaInimigos.add(new Inimigo("Zumbi", 22, 6, 6));
		listaInimigos.add(new Inimigo("Urso", 30, 8, 9));
		listaInimigos.add(new Inimigo("Vampiro", 35, 10, 10));
		listaInimigos.add(new Inimigo("Arok, Mestre Supremo", 50, 20, 20));
	}
	
	public void setListaHerois(Heroi heroi) {
		listaHerois.add(0, heroi);
	}
	
	public List<Heroi> getListaHerois() {
		return listaHerois;
	}
	
	public List<Inimigo> getListaInimigos() {
		return listaInimigos;
	}
	
}
