package br.com.heroesofoop.model;

public class Arma {
	
	private int ataque;
	private int defesa;
	
		
	public Arma(int ataque, int defesa) {
		super();
		this.ataque = ataque;
		this.defesa = defesa;
	}


	public int getAtaque() {
		return ataque;
	}


	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}


	public int getDefesa() {
		return defesa;
	}


	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	
	
}
