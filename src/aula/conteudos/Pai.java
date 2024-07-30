package aula.conteudos;

public class Pai {
	private boolean possuiCasa = true;
	protected boolean moraNaCasa = true;

	public boolean getPossuiCasa () {
		return this.possuiCasa;
	}

	public boolean getMoraNaCasa() {
		return moraNaCasa;
	}

	public void setMoraNaCasa(boolean moraNaCasa) {
		this.moraNaCasa = moraNaCasa;
	}
	
}

class Filho extends Pai {
	private boolean vaiHerdarUmaCasa;

	public boolean getVaiHerdarUmaCasa() {
		return vaiHerdarUmaCasa;
	}

	public void setVaiHerdarUmaCasa(boolean vaiHerdarUmaCasa) {
		this.vaiHerdarUmaCasa = vaiHerdarUmaCasa;
	}
	
	public Filho() {
		this.vaiHerdarUmaCasa = getPossuiCasa();
	}
}
