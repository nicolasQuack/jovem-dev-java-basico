package avaliacao.semana2.models;

import java.util.Random;

import avaliacao.semana2.exceptions.PersonagemDerrotadoException;

public abstract class Personagem {
		
	private String nome;
	private int maxHp;
	private int hp;
	private int ataque;
	private int defesa;

	protected Personagem(String nome, int maxHp, int ataque, int defesa) {
		this.nome = nome;
		this.maxHp = maxHp;
		this.hp = maxHp;
		this.ataque = ataque;
		this.defesa = defesa;
	}

	public void batalhar(Personagem inimigo) {

		System.out.println("Batalha iniciada: (" + nome + " vs " + inimigo.nome + ")");
		
		int turno = 0;

		do {
			if (turno % 2 == 0) {
				atacar(inimigo);
				System.out.println("vida inimigo: " + inimigo.hp + "/" + inimigo.maxHp);
			} else {
				inimigo.atacar(this);
				System.out.println("vida herói: " + this.hp + "/" + maxHp);
			}
			System.out.println("*************************************");
			try {
				Thread.sleep(600);
			} catch (InterruptedException e) {
				break;
			}
			turno++;
		} while (inimigo.hp > 0 && hp > 0);

		try {
			throw new PersonagemDerrotadoException();
		} catch (PersonagemDerrotadoException e) {
			String msg = " foi derrotado por ";
			if (hp <= 0) {
				System.out.println(nome + msg + inimigo.nome + "\n");
			} else {
				System.out.println(inimigo.nome + msg + nome + "\n");
				inimigo.hp = inimigo.maxHp;
			}

		}
	}
	
	Random random = new Random();

	public void atacar(Personagem inimigo) {

		int ataqueTotal = ataque;
		
		int dado = random.nextInt(6) + 1;

		ataqueTotal += dado;

		if (ataqueTotal > inimigo.defesa) {
			ataqueTotal -= inimigo.defesa;
			System.out.println("O ataque do " + this.nome + " foi um sucesso!");
		} else {
			ataqueTotal = 0;
			System.out.println("O ataque do " + this.nome + " falhou!");
		}

		inimigo.hp -= (ataqueTotal);

		System.out.println(this.ataque + " + " + dado + " - " + inimigo.defesa + ": " + ataqueTotal);

	}

	public String getNome () {
		return nome;
	}
}
